package com.raccoonberus.clientsvc.web.resource;

import org.apache.log4j.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class WelcomeResource {

    private final static Logger logger = Logger.getLogger(WelcomeResource.class);

    @Path("/")
    @GET
    public String hello() {
        logger.info("show hello message");
        return "Hello, everyone!<br/>This is client service!<br/>It can collect, validate and sort useful information.";
    }

}
