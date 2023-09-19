package com.xinyu.javalearn.generics.dao;

public interface BaseDao<T> {

    public T select(T t);

    public int insert(T t);

    public int update(T t);

    public int delete(T t);
}
