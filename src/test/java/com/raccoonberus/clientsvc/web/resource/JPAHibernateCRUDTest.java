package com.raccoonberus.clientsvc.web.resource;

import com.raccoonberus.clientsvc.model.Client;
import com.raccoonberus.clientsvc.model.Document;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class JPAHibernateCRUDTest extends JPAHibernateTest {

//    @Test
    public void testPersist_success() {
        String value = "0000 1111 22 33";
        Client client = new Client();

        em.getTransaction().begin();
        em.persist(client);
        em.persist(new Document().setType(Document.Type.PASSPORT).setValue(value).setClient(client));
        em.getTransaction().commit();

        List<Document> books = em.createNamedQuery("Document.getByValue", Document.class).setParameter(0, value).getResultList();

        assertNotNull(books);
        assertEquals(1, books.size());

        em.getTransaction().begin();
        em.remove(books.get(0));
        em.getTransaction().commit();

        books = em.createNamedQuery("Document.getAll", Document.class).getResultList();

        assertEquals(0, books.size());
    }

}
