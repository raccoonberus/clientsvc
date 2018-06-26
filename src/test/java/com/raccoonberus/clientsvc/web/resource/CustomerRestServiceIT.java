package com.raccoonberus.clientsvc.web.resource;

import com.raccoonberus.clientsvc.web.ClientSvcApplication;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.ext.RuntimeDelegate;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URI;

import static org.junit.Assert.assertEquals;

public class CustomerRestServiceIT {

    @Test
    public void shouldCheckURIs() throws IOException {

        URI uri = UriBuilder.fromUri("http://localhost/").port(8282).build();

        // Create an HTTP server listening at port 8282
        HttpServer server = HttpServer.create(new InetSocketAddress(uri.getPort()), 0);
        // Create a handler wrapping the JAX-RS application
        HttpHandler handler = RuntimeDelegate.getInstance().createEndpoint(new ClientSvcApplication(), HttpHandler.class);
        // Map JAX-RS handler to the server root
        server.createContext(uri.getPath(), handler);
        // Start the server
        server.start();

        Client client = ClientBuilder.newClient();

        // Valid URIs
        assertEquals(200, client.target("http://localhost:8282/customer/agoncal").request().get().getStatus());
        assertEquals(200, client.target("http://localhost:8282/customer/1234").request().get().getStatus());
        assertEquals(200, client.target("http://localhost:8282/customer?zip=75012").request().get().getStatus());
        assertEquals(200, client.target("http://localhost:8282/customer/search;firstname=John;surname=Smith").request().get().getStatus());

        // Invalid URIs
        assertEquals(404, client.target("http://localhost:8282/customer/AGONCAL").request().get().getStatus());
        assertEquals(404, client.target("http://localhost:8282/customer/dummy/1234").request().get().getStatus());

        // Stop HTTP server
        server.stop(0);
    }

}
