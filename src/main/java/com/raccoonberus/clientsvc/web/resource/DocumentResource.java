package com.raccoonberus.clientsvc.web.resource;

import com.raccoonberus.clientsvc.model.Document;
import com.raccoonberus.clientsvc.service.DocumentService;
import com.raccoonberus.clientsvc.web.model.CommonRespose;
import org.apache.log4j.Logger;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/document")
public class DocumentResource {

    private final static Logger logger = Logger.getLogger(DocumentResource.class);

//    private DocumentService documentService;

    @Path("/set-verified")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public CommonRespose setVerified(@Valid Document document) {
        logger.info("DocumentResource::setVerified call");
//        documentService.setVerified(document);
        return new CommonRespose();
    }

}
