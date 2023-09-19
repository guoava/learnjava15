package com.xinyu.javalearn.generics.extend;

import java.util.Arrays;
import java.util.List;

public class Reader<T> {

    // ? 任意类型
    // ? extend 某个类型及其子类
    T read(List<? extends T> list) {
        return list.get(0);
    }

    public static void main(String[] args) {
        List<String> str = Arrays.asList("Test String");
        List<Object> obj = Arrays.asList(new Object());
        List<Object> intg = Arrays.asList(new Integer("1"));
        List<Object> flot = Arrays.asList(new Float("1"));

        Reader<Object> objectReader = new Reader<>();
        System.out.println(objectReader.read(obj));
        System.out.println(objectReader.read(str));

        System.out.println(objectReader.read(intg));
        System.out.println(objectReader.read(flot));
    }
}
