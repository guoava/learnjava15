package com.xinyu.javalearn.event;

public class TestEvent {
    public static void main(String[] args) {
        Source source = new Source();
        source.addStateChangeListener(new SateChangeListener());
        source.changeState();
    }
}
