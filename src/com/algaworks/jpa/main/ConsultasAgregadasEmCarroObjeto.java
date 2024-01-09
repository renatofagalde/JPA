package com.algaworks.jpa.main;

import com.algaworks.jpa.main.modelo.Carro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Power by Intellij IDEA
 * <p>
 * Version information (versionamento)
 * <p>
 * Date 10/08/17 - 20:05
 * <p>
 * author renatofagalde
 * <p>
 * What this class does renatofagalde ?
 **/
public class ConsultasAgregadasEmCarroObjeto {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("locadoraVeiculoPU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String jpql = "select c, count(a), max(a.valorTotal), avg(a.valorTotal) "
				+ "from Carro c JOIN c.alugueis a "
				+ "group by c "
				+ "having count(a) > 1";

		List<Object[]> resultados = entityManager.createQuery(jpql).getResultList();
		for (Object[] obj : resultados) {
			System.out.println("Modelo: " + ((Carro) obj[0]).getModelo().getDescricao());
			System.out.println("Quantidade de alugueis: " + obj[1]);
			System.out.println("Valor máximo: " + obj[2]);
			System.out.println("Valor médio: " + obj[3]);
			System.out.println();
		}

		entityManager.close();
	}
}
