package com.xinyu.javalearn.generics;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class ChildGenericClass extends GenericClass<String> {
    public ChildGenericClass(String t) {
        super(t);
    }

    public static void main(String[] args) {

        ChildGenericClass childGenericClass = new ChildGenericClass("test");

        System.out.println(childGenericClass.getClass());
        System.out.println(childGenericClass.getClass().getSuperclass());
        System.out.println(childGenericClass.getClass().getGenericSuperclass());

        ParameterizedType parameterizedType = (ParameterizedType) childGenericClass.getClass().getGenericSuperclass();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();

        System.out.println(actualTypeArguments[0]);
        System.out.println(childGenericClass.getT());


    }

}
