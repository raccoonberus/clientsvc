package com.raccoonberus.clientsvc.model;

import javax.persistence.*;

@Entity
@Table(name = "name")
public class Name {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String last;
    private String first;
    private String middle;

    public Name() {
    }

    public Name(String last, String first, String middle) {
        this.last = last;
        this.first = first;
        this.middle = middle;
    }

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    public long getId() {
        return id;
    }

    public Name setId(long id) {
        this.id = id;
        return this;
    }

    public String getLast() {
        return last;
    }

    public Name setLast(String last) {
        this.last = last;
        return this;
    }

    public String getFirst() {
        return first;
    }

    public Name setFirst(String first) {
        this.first = first;
        return this;
    }

    public String getMiddle() {
        return middle;
    }

    public Name setMiddle(String middle) {
        this.middle = middle;
        return this;
    }

    public Client getClient() {
        return client;
    }

    public Name setClient(Client client) {
        this.client = client;
        return this;
    }
}
