package com.raccoonberus.clientsvc.web.it;

import com.raccoonberus.clientsvc.web.ClientSvcApplication;
import com.raccoonberus.clientsvc.web.resource.RegistrationResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.test.DeploymentContext;
import org.glassfish.jersey.test.JerseyTest;
import org.glassfish.jersey.test.ServletDeploymentContext;
import org.glassfish.jersey.test.grizzly.GrizzlyWebTestContainerFactory;
import org.glassfish.jersey.test.spi.TestContainerFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.core.Application;

public abstract class LocalJerseyTest extends JerseyTest {

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

    @Override
    protected Application configure() {
        return new ClientSvcApplication();
    }

    @Override
    protected DeploymentContext configureDeployment() {
        return ServletDeploymentContext.forServlet(new ServletContainer(
                new ResourceConfig(
//                        RegistrationResource.class
                ).packages("com.raccoonberus.clientsvc.web.resource")
        )).build();
    }

    @Override
    protected TestContainerFactory getTestContainerFactory() {
        return new GrizzlyWebTestContainerFactory();
    }


}
