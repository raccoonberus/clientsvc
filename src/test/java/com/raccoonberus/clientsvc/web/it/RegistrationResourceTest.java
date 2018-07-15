package com.raccoonberus.clientsvc.web.it;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import com.raccoonberus.clientsvc.web.resource.RegistrationResource;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.inject.Inject;
import java.net.URL;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:test-context.xml"}, inheritLocations = false)
public class RegistrationResourceTest {

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext wac;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders
                .webAppContextSetup(wac)
                .alwaysDo(print())
                .build();
    }

    @Test
    public void simple() throws Exception {
        URL resource = Resources.getResource("META-INF/json/registration-simple.json");
        String body = Resources.toString(resource, Charsets.UTF_8);

        mockMvc
                .perform(
                        post("/registration/simple")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(body)
                )
                .andDo(print())
                .andExpect(status().isCreated());

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
        assertTrue(response.readEntity(CommonResponse.class).isSuccess());*/
    }

}
