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
public class ConsultaModeloCarroNAOTIPADOObjeto {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("locadoraVeiculoPU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();



		System.out.println("\n\n\n***************************** INICO\n\n");
		
		String jpql = "select mc.descricao, mc.categoria from ModeloCarro mc";
		List<Object[]> resultados = entityManager.createQuery(jpql).getResultList();
		
		for (Object[] objects : resultados ) {

			System.out.println("objects[0],objects[1] = " + objects[0]+"\t"+objects[1]);
			
		}


		System.out.println("\n\n\n***************************** FIM");

		entityManager.close();
		entityManagerFactory.close();

		System.exit(0);
	}
}
