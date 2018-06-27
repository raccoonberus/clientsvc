package com.raccoonberus.clientsvc.web.resource;

import com.raccoonberus.clientsvc.web.model.RegistrationModel;
import org.apache.log4j.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/registration")
public class RegistrationResource {

    private final static Logger logger = Logger.getLogger(RegistrationResource.class);

//    @Path("/")
    @GET // TODO: do POST
    @Produces(MediaType.APPLICATION_JSON)
    public RegistrationModel register() {
        logger.info("register method call");
        return new RegistrationModel();
    }

}
