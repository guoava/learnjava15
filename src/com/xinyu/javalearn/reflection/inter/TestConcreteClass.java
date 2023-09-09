package com.xinyu.javalearn.reflection.inter;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class TestConcreteClass {
    public static void getClassObj() {
        try {
            Class<?> concreteClassClass = ConcreteClass.class;
            concreteClassClass = new ConcreteClass(5).getClass();
            concreteClassClass = Class.forName("com.xinyu.javalearn.reflection.inter.ConcreteClass");
            System.out.println(concreteClassClass.getName());

            System.out.println(concreteClassClass.getPackage().getName());
            System.out.println(Modifier.toString(concreteClassClass.getModifiers()));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getSuperClass(){
        try {
            Class<?> aClass = Class.forName("com.xinyu.javalearn.reflection.inter.ConcreteClass");
            Class<?> superclass = aClass.getSuperclass();
            System.out.println("superclass = " + superclass);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getInterfaces(){
        try {
            Class<?> aClass = Class.forName("com.xinyu.javalearn.reflection.inter.ConcreteClass");
            Class<?>[] interfaces = aClass.getInterfaces();
            System.out.println(interfaces[0]);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getDeclaredClasses(){
        try {
            Class<?> aClass = Class.forName("com.xinyu.javalearn.reflection.inter.ConcreteClass");
            Class<?>[] declaredClasses = aClass.getDeclaredClasses();
            System.out.println("Arrays.toString(declaredClasses) = " + Arrays.toString(declaredClasses));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getAllAnnotations(){
        try {
            Class<?> aClass = Class.forName("com.xinyu.javalearn.reflection.inter.ConcreteClass");
            Method[] methods = aClass.getMethods();
            for (Method method : methods) {
                Annotation[] annotations = method.getAnnotations();
                for (Annotation annotation : annotations) {
                    System.out.println(method + "" + annotation+"   ");
                }
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        getClassObj();
        getSuperClass();
        getInterfaces();
        getDeclaredClasses();
        getAllAnnotations();
    }
}
