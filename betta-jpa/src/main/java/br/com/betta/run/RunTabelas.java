package br.com.betta.run;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RunTabelas {

	public static void main(String[] args) {
//		Chmando a JPA para criar fabrica de tabelas
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("conta");
		
		EntityManager createEntityManager = emf.createEntityManager();
		emf.close();

	}

}
