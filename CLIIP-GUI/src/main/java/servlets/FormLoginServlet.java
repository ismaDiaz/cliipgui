package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsuarioDAOImplementation;
import model.Usuario;

/**
 * Servlet implementation class FormLoginServlet
 */
@WebServlet("/FormLoginServlet")
public class FormLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String email = req.getParameter("email");
    	String password = req.getParameter("password");
    	
    	List<Usuario> usuarios = (List<Usuario>) UsuarioDAOImplementation.getInstance().readAll();
    	Usuario u = UsuarioDAOImplementation.getInstance().login(email, password);
    	
    	if( u.getEmail().equals(email) && u.getPassword().equals(password) ) {
    		//req.getSession().setAttribute("admin", true);
    		//req.getSession().setAttribute("usuarios", usuarios);
    		getServletContext().getRequestDispatcher("/Principal.jsp").forward(req,resp);
			/*
			 * } else if ( null != u ) { req.getSession().setAttribute("usuario", u);
			 * getServletContext().getRequestDispatcher("/TFG.jsp").forward(req,resp);
			 */
    	} else {
    		getServletContext().getRequestDispatcher("/index.jsp").forward(req,resp);
    	}
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
