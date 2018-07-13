package com.raccoonberus.clientsvc.web.resource;

import com.raccoonberus.clientsvc.model.Document;
import com.raccoonberus.clientsvc.web.model.CommonRespose;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
@RequestMapping("document")
public class DocumentResource {

    @RequestMapping(value = "set-verified", method = RequestMethod.PUT)
    public CommonRespose setVerified(@Valid Document document) {
        return new CommonRespose();
    }

}
