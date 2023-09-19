package com.xinyu.javalearn.generics.dao;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;

public class BaseDaoImpl<T> implements BaseDao<T> {

    private Class<T> TableCls;

    public BaseDaoImpl() {
        ParameterizedType parameterizedType = (ParameterizedType) getClass().getGenericSuperclass();
        TableCls = (Class<T>) parameterizedType.getActualTypeArguments()[0];
    }

    @Override
    public T select(T t) {

        String sql = "select * from " + TableCls.getSimpleName();
        T t1 = null;
        try {
            t1 = TableCls.newInstance();

            for (Field field : TableCls.getDeclaredFields()) {
                field.setAccessible(true);
                // 从数据库查询 并设置到实体类中
                //            field.set(t1,rs.getObject(field.getName()));
            }
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return t1;
    }

    @Override
    public int insert(T t) {
        String sqlstr = "insert into " + TableCls.getSimpleName() + " (";
        Field fields[] = TableCls.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            String colName = field.getName();
            sqlstr += colName + ",";
        }
        sqlstr += ") values (";
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                sqlstr += field.get(t) + ",";
            } catch (Exception e) {
            }
        }
        sqlstr += ")";
        System.out.println(sqlstr);
        /*
         * 用 JDBC 执行 SQL 语句
         */
        return 0;
    }

    @Override
    public int update(T t) {
        return 0;
    }

    @Override
    public int delete(T t) {
        return 0;
    }
}
