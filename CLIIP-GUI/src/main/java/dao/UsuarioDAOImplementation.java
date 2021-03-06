package dao;

import java.util.Collection;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import model.Usuario;

public class UsuarioDAOImplementation implements UsuarioDAO {
	private static UsuarioDAOImplementation instancia = null;
	private UsuarioDAOImplementation() {
	}

	public static UsuarioDAOImplementation getInstance() {
		if( null == instancia ) 
			instancia = new UsuarioDAOImplementation();
		return instancia;
	}


	@SuppressWarnings("unchecked")
	@Override
	public void create(Usuario u) {
		// TODO Auto-generated method stub
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		// operaciones
		
		session.save(u);
		session.getTransaction().commit();
		session.close();



	}
	@SuppressWarnings("unchecked")
	@Override
	public Usuario read(String email) {
		// TODO Auto-generated method stub
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		// operaciones
		
		Usuario u = session.get(Usuario.class, email);
		session.getTransaction().commit();
		session.close();
		return u;
	}
	@SuppressWarnings("unchecked")
	@Override
	public void update(Usuario u) {
		// TODO Auto-generated method stub
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		// operaciones
		
		session.saveOrUpdate(u);
		session.getTransaction().commit();
		session.close();

	}
	@SuppressWarnings("unchecked")
	@Override
	public void delete(Usuario u) {
		// TODO Auto-generated method stub
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		// operaciones
		
		session.delete(u);
		session.getTransaction().commit();
		session.close();

	}
	@SuppressWarnings("unchecked")
	@Override
	public Collection<Usuario> readAll() {
		// TODO Auto-generated method stub
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		// operaciones
		
		List<Usuario> usuarios = session.createQuery("from usuarios").list();
		session.getTransaction().commit();
		session.close();
		return usuarios;
	}
	@SuppressWarnings("unchecked")
	@Override
	public Usuario login(String email, String password) {
		// TODO Auto-generated method stub
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		// operaciones

		Usuario u = null;
		Query q = session.createQuery("select u from usuarios u where u.email = :email and u.password = :password");
		q.setParameter("email", email);
		q.setParameter("password", password);
		List<Usuario> usuarios = q.getResultList();
		if (usuarios.size() > 0)
			u = (Usuario) (q.getResultList().get(0));

		session.getTransaction().commit();
		session.close();
		return u;
	}
}
