package com.xinyu.javalearn.classloader.my;

public class MyClass {
    public MyClass() {
    }

    public void show() {
        System.out.println("Show test");
    }

    public void invokeAnotherObjShow(MyClass myClass) {
        myClass.show();
    }
}
