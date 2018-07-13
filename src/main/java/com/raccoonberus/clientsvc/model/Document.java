package com.raccoonberus.clientsvc.model;

import javax.persistence.*;

@Entity
@Table(name = "document")
@NamedQueries(value = {
        @NamedQuery(name = "Document.getAll", query = "SELECT d FROM Document d"),
        @NamedQuery(name = "Document.getByValue", query = "SELECT d FROM Document d WHERE d.value = ?")
})
public class Document {

    public enum Type {PASSPORT, SNILS}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "type", nullable = false)
    private Type type;

    @Column(name = "value", unique = true, nullable = false)
    private String value;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    public long getId() {
        return id;
    }

    public Document setId(long id) {
        this.id = id;
        return this;
    }

    public Type getType() {
        return type;
    }

    public Document setType(Type type) {
        this.type = type;
        return this;
    }

    public String getValue() {
        return value;
    }

    public Document setValue(String value) {
        this.value = value;
        return this;
    }

    public Client getClient() {
        return client;
    }

    public Document setClient(Client client) {
        this.client = client;
        return this;
    }
}
