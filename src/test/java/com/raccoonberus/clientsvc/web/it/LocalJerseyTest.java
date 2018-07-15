package com.raccoonberus.clientsvc.web.it;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;


public abstract class LocalJerseyTest {

    //    private static EntityManagerFactory emf;
    @PersistenceContext
    protected EntityManager em;

    @BeforeClass
    public static void init() {
//        emf = Persistence.createEntityManagerFactory("mnf-pu-test");
//        em = emf.createEntityManager();
    }

    @AfterClass
    public static void down() {
//        em.clear();
//        em.close();
//        emf.close();
    }

}
