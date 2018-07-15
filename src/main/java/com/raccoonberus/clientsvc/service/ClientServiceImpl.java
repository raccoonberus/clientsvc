package com.raccoonberus.clientsvc.service;

import com.raccoonberus.clientsvc.dao.ClientDao;
import com.raccoonberus.clientsvc.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("clientService")
public class ClientServiceImpl implements ClientService {

    private ClientDao clientDao;

    public void create(Client client) {
        clientDao.create(client);
    }

    @Autowired
    public void setClientDao(ClientDao clientDao) {
        this.clientDao = clientDao;
    }
}
