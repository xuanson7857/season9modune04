package com.ra.model.DAO;

import java.util.List;

public interface IGenericDAO<T, ID> {
    List<T> findAll();

    boolean saveOrUpdate(T t);

    T findById(ID id);

    void delete(ID id);
}
