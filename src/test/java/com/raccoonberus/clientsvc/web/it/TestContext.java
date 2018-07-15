package com.raccoonberus.clientsvc.web.it;

import com.raccoonberus.clientsvc.dao.ClientDao;
import com.raccoonberus.clientsvc.dao.hibernate.ClientDaoImpl;
import com.raccoonberus.clientsvc.model.Client;
import com.raccoonberus.clientsvc.service.ClientService;
import com.raccoonberus.clientsvc.service.ClientServiceImpl;
import org.junit.BeforeClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestContext {

    @Bean
    public ClientService clientService() {
        ClientDaoImpl clientDao = new ClientDaoImpl();
        ClientServiceImpl clientService = new ClientServiceImpl();
        clientService.setClientDao(clientDao);
        return clientService;
    }

}
