package com.algaworks.jpa.main;

import com.algaworks.jpa.model.entity.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Power by Intellij IDEA
 * <p>
 * Version information (versionamento)
 * <p>
 * Date 04/08/17 - 10:32
 * <p>
 * author renatofagalde
 * <p>
 * What this class does renatofagalde Salvando primeiro objeto no banco de dados
 **/
public class SalvandoPrimeiroObjeto {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Cliente cliente = new Cliente("Maria",10,"F","Analista");

		entityManager.getTransaction().begin();

		entityManager.persist(cliente);


		entityManager.getTransaction().commit();

		System.out.println("SalvandoPrimeiroObjeto.main Salvo!");



		//não esquecer de fechar o entityManager
		entityManager.close();
		entityManagerFactory.close();


		System.exit(0);

	}
}
