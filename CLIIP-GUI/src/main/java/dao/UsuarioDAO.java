package dao;
import java.util.Collection;

import model.Usuario;


public interface UsuarioDAO {
	public void create(Usuario tfg);
	public Usuario read(String email);
	public void update(Usuario tfg);
	public void delete(Usuario tfg);
	public Collection<Usuario> readAll();
	public Usuario login(String email, String psd);
}