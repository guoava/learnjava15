package com.xinyu.javalearn.classloader.order;

public class Parent {
    static Stub parentStaticObject = new Stub("Parent static object -");

    static {
        System.out.println("Parent static code execute.");
    }

    {
        System.out.println("parent code execute");
    }

    Stub parentObject = new Stub("Parent object -");

    Stub stub;

    public Parent() {
        System.out.println("parent constructor execute.");
        stub = new Stub("Parent constructor create object");
    }

    public void sayHello() {
        System.out.println("say hello from Parent");
    }

}
