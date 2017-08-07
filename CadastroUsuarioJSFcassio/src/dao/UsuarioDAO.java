package dao;

import javax.persistence.EntityManager;

import model.Usuario;
import util.JpaUtil;

public class UsuarioDAO {

	private EntityManager em;
	
	public UsuarioDAO() {
		em = JpaUtil.getFactory();
		
	}
	
	
	public void save(Usuario u) {
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
		em.clear();
	}
}
