package com.raccoonberus.clientsvc.web.it;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class DocumentResourceTest {

    @Test
    public void verification() {
        /*String val = "983hf984hf94389384hf9348fhf4398488489389483";

        Client client = new Client();
        client.setBirthDate(new Date());
        Document document = new Document().setType(Document.Type.PASSPORT).setValue(val).setClient(client);
        client.getDocuments().add(document);

        List<Document> books = em.createNamedQuery("Document.getByValue", Document.class)
                .setParameter(0, val)
                .getResultList();
        assertNotNull(books);
        assertEquals(0, books.size());

        em.getTransaction().begin();
        em.persist(client);
        em.getTransaction().commit();

        Response response = target("document").path("set-verified")
                .request()
                .put(Entity.entity(document, MediaType.APPLICATION_JSON));

        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
        assertTrue(response.readEntity(CommonResponse.class).isSuccess());*/
    }

    @Test
    public void verificationNonexistent() {
        /*String val = "878787788778 567890";
        Document document = new Document().setType(Document.Type.PASSPORT).setValue(val);

        Response response = target("document").path("set-verified")
                .request()
                .put(Entity.entity(document, MediaType.APPLICATION_JSON));*/
    }

}
