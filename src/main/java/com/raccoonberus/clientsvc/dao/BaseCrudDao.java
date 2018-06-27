package com.raccoonberus.clientsvc.dao;

public interface BaseCrudDao<T> {
    void create(T entity);

    T read(Object id);

    void update(T entity);

    void delete(T entity);
}
