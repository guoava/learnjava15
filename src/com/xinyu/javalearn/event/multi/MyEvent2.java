package com.xinyu.javalearn.event.multi;

import com.xinyu.javalearn.event.Source;

import java.util.EventObject;

public class MyEvent2 extends EventObject {

    private int state;
    private String msg;

    public MyEvent2(Object source) {
        super(source);
        state = ((Source2) source).getState();
        msg = ((Source2) source).getMessage();
    }

    public int getSourceState() {
        return this.state;
    }

    public String getSourceMessage() {
        return this.msg;
    }
}
