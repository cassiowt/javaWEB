package dao;

import javax.persistence.EntityManager;

import model.Animal;
import util.JpaUtil;

public class AnimalDAO {

	private EntityManager em;
	
	public AnimalDAO() {
		em = JpaUtil.getFactory();
		
	}
	
	public void save(Animal a) {
		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
		em.clear();
	}
}
