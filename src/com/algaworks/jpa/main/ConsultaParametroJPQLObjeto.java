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
public class ConsultaParametroJPQLObjeto {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("exemploPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        String modelo = "vectra";

        List<String> modelos = entityManager.createQuery("select mc.descricao from ModeloCarro mc where mc.fabricante.nome=:modelo", String.class)
                .setParameter("modelo", modelo)
                .getResultList();

        for (String m: modelos) {
            System.out.println("ConsultaJPQLObjeto.main nome = " + m);
        }


        entityManager.close();
        entityManagerFactory.close();

        System.exit(0);
    }
}
