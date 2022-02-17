package br.com.betta.run;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.betta.jpa.modelo.Conta;
import br.com.betta.jpa.modelo.Util;

public class AlteraConta {
Util aux ;
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("conta");
		EntityManager em = emf.createEntityManager();
		
		Conta c = em.find(Conta.class, 4L);
		em.persist(c);
		em.getTransaction().begin();
		System.out.println(c.toString());
		
		c.setAgencia(6544);
		c.setNumero(2215);
		c.setSaldo(110.5);
		c.setTitular("Lucas");
		em.getTransaction().commit();
		
		System.out.println(c.toString());
		
		
		
		
		
		
		
		
		
		
		
		
//		em.getTransaction().begin();
//		em.persist(c);
//		em.getTransaction().commit();
//		System.out.println(c.toString());

	}
	
	

}
