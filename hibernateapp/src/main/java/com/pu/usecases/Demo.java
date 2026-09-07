package com.pu.usecases;

import com.pu.entities.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Demo {
	public static void main(String[] args) {
		
		// One per Application
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("myConfig");
		
		// One per usecases
		EntityManager em=emf.createEntityManager();
		
		// Transient State / New State
		Student st=new Student(6, "Keyur", "ahmedabad");
		
		// Persisitence State
		em.getTransaction().begin();
		
		em.persist(st);
		em.getTransaction().commit();
		
		// Detached State

		// em.close();
		em.getTransaction().begin();
		
		st.setCity("anand");
		
		em.getTransaction().commit();
		
		

//		// Retrieve
//		Student st=em.find(Student.class, 2);
//		System.out.println(st.getName());
		
//		// Storing data
//		Student st=new Student(3, "Rahul", "Surat");
//		
//		
//		em.getTransaction().begin();
//		em.persist(st);
//		System.out.println("student is stored");
//		
//		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
