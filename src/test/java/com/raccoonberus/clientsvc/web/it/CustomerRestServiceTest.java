package com.raccoonberus.clientsvc.web.it;

import com.raccoonberus.clientsvc.web.ClientSvcApplication;
import com.raccoonberus.clientsvc.web.model.RegistrationModel;
import com.raccoonberus.clientsvc.web.resource.RegistrationResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.test.DeploymentContext;
import org.glassfish.jersey.test.JerseyTest;
import org.glassfish.jersey.test.ServletDeploymentContext;
import org.glassfish.jersey.test.grizzly.GrizzlyWebTestContainerFactory;
import org.glassfish.jersey.test.spi.TestContainerFactory;
import org.junit.Test;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CustomerRestServiceTest extends JerseyTest {

    @Override
    protected Application configure() {
//        return new ResourceConfig(RegistrationResource.class);
        return new ClientSvcApplication();
    }

    @Override
    protected DeploymentContext configureDeployment() {
        return ServletDeploymentContext.forServlet(new ServletContainer(
                new ResourceConfig(
                        RegistrationResource.class
                )
        )).build();
    }

    @Override
    protected TestContainerFactory getTestContainerFactory() {
        return new GrizzlyWebTestContainerFactory();
    }

    @Test
    public void echo() {
        Response response = target("registration")
//                .path("registration")
                .request()
                .get();

        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
        assertEquals(MediaType.APPLICATION_JSON_TYPE, response.getMediaType());
        assertTrue(response.readEntity(RegistrationModel.class).isSuccess());
    }
}
