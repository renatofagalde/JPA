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
public class ConsultaAcessoriosPorModeloDeCarroObjeto {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("locadoraVeiculoPU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String jpql = "select a.descricao from Carro c join c.acessorios a where c.modelo.descricao='vectra'";

		List<String> acessorios = entityManager.createQuery(jpql,String.class).getResultList();


		System.out.println("\n\n\n***************************** INICO\n\n");



		for (String s : acessorios) {
			System.out.println("acessórios\t"+s);
		}



		System.out.println("\n\n\n***************************** FIM");

		entityManager.close();
		entityManagerFactory.close();

		System.exit(0);
	}
}
