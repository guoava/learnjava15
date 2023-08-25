package com.xinyu.javalearn.classloader.order;

public class Child extends Parent {

    static Stub childStaticObject = new Stub("Child static object-");

    static {
        System.out.println("Child static code execute.");
    }

    {
        System.out.println("Child code execute.");
    }

    Stub childObject = new Stub("Child code execute.");
    Stub stub;

    public Child() {
        System.out.println("Child constructor execute");
        stub = new Stub("Child constructor create object");
    }

    public void sayHello() {
        System.out.println("say hello from Child");
    }

}
