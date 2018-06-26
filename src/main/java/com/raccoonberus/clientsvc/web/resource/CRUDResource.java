package com.raccoonberus.clientsvc.web.resource;

import com.raccoonberus.clientsvc.model.Client;
import com.raccoonberus.clientsvc.web.model.RegistrationModel;

import javax.validation.Valid;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/crud")
public class CRUDResource {

    public Response edit(@Valid Client client) {
        return Response.ok(new RegistrationModel()).build();
    }

}
