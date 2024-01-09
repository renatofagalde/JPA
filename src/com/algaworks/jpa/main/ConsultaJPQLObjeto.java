package com.algaworks.jpa.main;

import com.algaworks.jpa.model.entity.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

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
public class ConsultaJPQLObjeto {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();


		List<Cliente> clienteList = entityManager.createQuery("from Cliente", Cliente.class)
				.getResultList();

		for (Cliente cliente : clienteList) {
			System.out.println("ConsultaJPQLObjeto.main nome = "+cliente.getNome());
			System.out.println("ConsultaJPQLObjeto.main profissao = "+cliente.getProfissao());
		}


		entityManager.close();
		entityManagerFactory.close();

		System.exit(0);
	}
}
