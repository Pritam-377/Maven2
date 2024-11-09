package com.hii;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("girish");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Review r1 = new Review();
		r1.setId(1);
		r1.setHeading("good");
		r1.setMsg("must buy");

		Review r2 = new Review();
		r2.setId(2);
		r2.setHeading("good");
		r2.setMsg("must buy");

		Product p1 = new Product();
		p1.setId(101);
		p1.setName("puma");
		p1.setCost(6000);
		r1.setPro(p1);
		r2.setPro(p1);

		et.begin();
		em.persist(p1);
		em.persist(r1);
		em.persist(r2);
		et.commit();

	}

}
