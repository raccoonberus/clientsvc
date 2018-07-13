package com.raccoonberus.clientsvc.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "birth_date")
    private Date birthDate;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy = "client")
    private List<Name> names = new ArrayList<Name>();

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy = "client")
    private List<Contact> contacts = new ArrayList<Contact>();

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy = "client")
    private List<Address> addresses = new ArrayList<Address>();

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy = "client")
    private List<Document> documents = new ArrayList<Document>();

    public long getId() {
        return id;
    }

    public Client setId(long id) {
        this.id = id;
        return this;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Client setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public List<Name> getNames() {
        return names;
    }

    public Client setNames(List<Name> names) {
        this.names = names;
        return this;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public Client setContacts(List<Contact> contacts) {
        this.contacts = contacts;
        return this;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public Client setAddresses(List<Address> addresses) {
        this.addresses = addresses;
        return this;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public Client setDocuments(List<Document> documents) {
        this.documents = documents;
        return this;
    }
}
