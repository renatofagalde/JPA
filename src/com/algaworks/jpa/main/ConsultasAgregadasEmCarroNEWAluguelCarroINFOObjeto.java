package com.algaworks.jpa.main;

import com.algaworks.jpa.main.bean.AluguelCarroInfo;

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
public class ConsultasAgregadasEmCarroNEWAluguelCarroINFOObjeto {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("locadoraVeiculoPU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String jpql = "select NEW com.algaworks.jpa.main.bean.AluguelCarroInfo(c, count(a), max(a.valorTotal), avg(a.valorTotal)) "
				+ "from Carro c JOIN c.alugueis a "
				+ "group by c "
				+ "having count(a) > 1";

		List<AluguelCarroInfo> resultados = entityManager.createQuery(jpql, AluguelCarroInfo.class).getResultList();

		for (AluguelCarroInfo aci : resultados) {
			System.out.println("Modelo: " + aci.getCarro().getModelo().getDescricao());
			System.out.println("Quantidade de alugueis: " + aci.getTotalAlugueis());
			System.out.println("Valor máximo: " + aci.getValorMaximo());
			System.out.println("Valor médio: " + aci.getValorMedio());
			System.out.println();
		}

		entityManager.close();
	}
}
