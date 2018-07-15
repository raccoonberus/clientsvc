package com.raccoonberus.clientsvc.dao.hibernate;

import com.raccoonberus.clientsvc.dao.ClientDao;
import com.raccoonberus.clientsvc.model.Client;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class ClientDaoImpl implements ClientDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void create(Client entity) {
        em.persist(entity);
        em.flush();
    }

    @Override
    @Transactional(readOnly = true)
    public Client read(Object id) {
        return em.find(Client.class, id);
    }

    @Override
    public void update(Client entity) {
        em.merge(entity);
        em.flush();
    }

    @Override
    public void delete(Client entity) {
        em.remove(entity);
        em.flush();
    }

    @Override
    public Client findByContact(String contact) {
        try {
            return (Client) em.createQuery("FROM Client AS client " +
                    "JOIN client.contacts AS contact " +
                    "WHERE contact.value = :contact").setParameter("contact", contact)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
}
