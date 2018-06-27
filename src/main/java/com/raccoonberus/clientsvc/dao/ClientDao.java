package com.raccoonberus.clientsvc.dao;

import com.raccoonberus.clientsvc.model.Client;

public interface ClientDao extends BaseCrudDao<Client> {
    Client findByContact(String contact);
}
