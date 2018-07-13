package com.raccoonberus.clientsvc.web.it;

import com.raccoonberus.clientsvc.web.model.CommonRespose;
import com.raccoonberus.clientsvc.web.model.RegistrationSimpleRequest;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CustomerRestServiceTest extends LocalJerseyTest {

    @Test
    public void echo() {
        /*RegistrationSimpleRequest request = new RegistrationSimpleRequest();
        request.setLastName("Ivanov")
                .setFirstName("Petr")
                .setMiddleName("Sidorovich")
                .setBirthDate(new Date())
                .setEmail("ivanov.petr@mail.com")
                .setMobilePhone("+78905671234");

        Response response = target("registration")
                .path("simple")
                .request()
                .post(Entity.entity(request, MediaType.APPLICATION_JSON));

        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
        assertEquals(MediaType.APPLICATION_JSON_TYPE, response.getMediaType());
        assertTrue(response.readEntity(CommonRespose.class).isSuccess());*/
    }

}
