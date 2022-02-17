package br.com.betta.run;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.betta.jpa.modelo.Conta;

public class RunTabelas {

	public static void main(String[] args) {
		Conta c = new Conta();

		c.setAgencia(1828);
		c.setTitular("Juliano");
		c.setNumero(1235);
		c.setSaldo(2059.00);

		criaConta(c);

	}

	public static void criaConta(Conta c) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("conta");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		System.out.println(c.toString());
	}
	
	public static void alteraConta() {
		
	}

}
