package com.raccoonberus.clientsvc.web.resource;

import com.raccoonberus.clientsvc.model.Client;
import com.raccoonberus.clientsvc.model.Contact;
import com.raccoonberus.clientsvc.model.Name;
import com.raccoonberus.clientsvc.service.ClientService;
import com.raccoonberus.clientsvc.service.ClientServiceImpl;
import com.raccoonberus.clientsvc.web.model.CommonRespose;
import com.raccoonberus.clientsvc.web.model.RegistrationSimpleRequest;
import org.apache.log4j.Logger;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/registration")
public class RegistrationResource {

    private final static Logger logger = Logger.getLogger(RegistrationResource.class);

//    @Inject
    private ClientService clientService
            = new ClientServiceImpl();

    @Path("/simple")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public CommonRespose simple(RegistrationSimpleRequest request) {
        logger.info("register method call");

        Client client = new Client();
        client.getNames()
                .add(new Name(request.getLastName(), request.getFirstName(), request.getMiddleName()));

        if (null != request.getEmail() && !"".equals(request.getEmail()))
            client.getContacts().add(new Contact(Contact.Type.EMAIL, request.getEmail()));

        if (null != request.getMobilePhone() && !"".equals(request.getMobilePhone()))
            client.getContacts().add(new Contact(Contact.Type.MOBILE_PHONE, request.getMobilePhone()));

        clientService.create(client);

        return new CommonRespose(true);
    }

}
