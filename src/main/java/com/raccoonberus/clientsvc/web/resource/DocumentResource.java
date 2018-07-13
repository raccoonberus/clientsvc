package com.raccoonberus.clientsvc.web.resource;

import com.raccoonberus.clientsvc.model.Document;
import com.raccoonberus.clientsvc.web.model.CommonRespose;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("document")
public class DocumentResource {

    @RequestMapping(value = "set-verified", method = RequestMethod.PUT)
    public CommonRespose setVerified(Document document) {
        return new CommonRespose();
    }

}
