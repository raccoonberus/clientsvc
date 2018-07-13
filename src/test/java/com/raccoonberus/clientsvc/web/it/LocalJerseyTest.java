package com.raccoonberus.clientsvc.web.it;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class LocalJerseyTest {

    private static EntityManagerFactory emf;
    static EntityManager em;

    @BeforeClass
    public static void init() {
        emf = Persistence.createEntityManagerFactory("mnf-pu-test");
        em = emf.createEntityManager();
    }

    @AfterClass
    public static void down() {
        em.clear();
        em.close();
        emf.close();
    }

}
