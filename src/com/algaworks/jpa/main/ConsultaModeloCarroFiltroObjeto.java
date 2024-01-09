package com.algaworks.jpa.main;

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
public class ConsultaModeloCarroFiltroObjeto {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("locadoraVeiculoPU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();



		System.out.println("\n\n\n***************************** INICO\n\n");

		List<String> list = entityManager.createQuery("select mc.descricao from ModeloCarro mc where mc.fabricante.nome='Honda'", String.class).getResultList();

		for (String s : list) {

			System.out.println(" descricao "+s);

		}


		System.out.println("\n\n\n***************************** FIM");

		entityManager.close();
		entityManagerFactory.close();

		System.exit(0);
	}
}
