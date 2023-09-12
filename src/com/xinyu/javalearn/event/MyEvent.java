package com.xinyu.javalearn.event;

import java.util.EventObject;

public class MyEvent extends EventObject {

    private int state;

    private String msg;

    public MyEvent(Object source) {
        super(source);
        this.msg = ((Source) source).getMsg();
        this.state = ((Source) source).getState();
    }

    public int getSourceState() {
        return state;
    }

    public String getSourceMsg() {
        return msg;
    }
}
