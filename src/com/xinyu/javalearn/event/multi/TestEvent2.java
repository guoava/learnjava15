package com.xinyu.javalearn.event.multi;

public class TestEvent2 {
    public static void main(String[] args) {
        Source2 source = new Source2();
        try {
            source.addStateChangeListener(Class.forName("com.xinyu.javalearn.event.multi.StateChangeListener2"));
        } catch (ClassNotFoundException e) {
        }
        source.changeState();
    }
}
