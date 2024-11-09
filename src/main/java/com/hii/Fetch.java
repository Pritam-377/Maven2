package com.hii;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Fetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("girish");
		EntityManager em = emf.createEntityManager();
		
		Review r1=em.find(Review.class, 1);
		if(r1!=null)
		{
			Product p1=r1.getPro();
			System.out.println(p1.getId());
			System.out.println(p1.getName());
			System.out.println(p1.getCost());
			System.out.println(r1.getId());
			System.out.println(r1.getHeading());
			System.out.println(r1.getMsg());
		}

	}

}
