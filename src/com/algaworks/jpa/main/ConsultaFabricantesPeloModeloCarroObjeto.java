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
public class ConsultaFabricantesPeloModeloCarroObjeto {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("locadoraVeiculoPU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();


		//devolvendo o objeto fabricante
		//List<Fabricante> fabricanteList = entityManager.createQuery("select f.nome from Fabricante f", Fabricante.class).getResultList();
		List<String> fabricanteList = entityManager.createQuery("select mc.fabricante.nome from ModeloCarro mc", String.class).getResultList();
		System.out.println("\n\n\n***************************** INICIO");

//		for (Fabricante f: fabricanteList) {
//			System.out.println("\n\n nome = "+f.getNome());
//		}

		for (String f: fabricanteList) {
			System.out.println("\n\n nome = "+f);
		}


		System.out.println("\n\n\n***************************** FIM");

		entityManager.close();
		entityManagerFactory.close();

		System.exit(0);
	}
}
