package com.xinyu.javalearn.reflection;

import java.lang.reflect.Method;

public class SimpleReflection {

    public SimpleReflection() {
    }

    public int doSomething() {
        return 0;
    }

    public static void main(String[] args) {

        try {
            Class<?> aClass = Class.forName("com.xinyu.javalearn.reflection.SimpleReflection");
            Method[] methods = aClass.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("name = " + method.getName());
            }

//            Method[] methods1 = aClass.getSuperclass().getDeclaredMethods();
            Method[] methods1 = aClass.getMethods();
            for (Method method : methods1) {
                System.out.println("parent class name = " + method.getName());
            }

            Class<?> superclass = aClass.getSuperclass().getSuperclass();
            System.out.println("superclass.getName() = " + superclass.getName());

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
