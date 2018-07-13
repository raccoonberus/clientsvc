package com.raccoonberus.clientsvc.web.resource;

import com.raccoonberus.clientsvc.model.Client;
import com.raccoonberus.clientsvc.model.Contact;
import com.raccoonberus.clientsvc.model.Name;
import com.raccoonberus.clientsvc.service.ClientService;
import com.raccoonberus.clientsvc.web.model.CommonResponse;
import com.raccoonberus.clientsvc.web.model.RegistrationSimpleRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("registration")
public class RegistrationResource {

    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "simple", method = RequestMethod.POST)
    public CommonResponse simple(RegistrationSimpleRequest request) {
        Client client = new Client();
        client.getNames()
                .add(new Name(request.getLastName(), request.getFirstName(), request.getMiddleName()));

        if (null != request.getEmail() && !"".equals(request.getEmail()))
            client.getContacts().add(new Contact(Contact.Type.EMAIL, request.getEmail()));

        if (null != request.getMobilePhone() && !"".equals(request.getMobilePhone()))
            client.getContacts().add(new Contact(Contact.Type.MOBILE_PHONE, request.getMobilePhone()));

        clientService.create(client);

        return new CommonResponse(true);
    }

}
