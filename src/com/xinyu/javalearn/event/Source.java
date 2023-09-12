package com.xinyu.javalearn.event;

import java.util.EventListener;
import java.util.HashSet;
import java.util.Set;

public class Source {
    private int state = 0;
    private String msg = "";

    Set<EventListener> listeners = new HashSet<>();

    public void addStateChangeListener(SateChangeListener sateChangeListener) {
        listeners.add(sateChangeListener);
    }

    public void notifyListener() {
        for (EventListener listener : listeners) {
            ((SateChangeListener) listener).handleEvent(new MyEvent(this));
        }
    }

    public void changeState() {
        state = (state == 0 ? 1 : 0);
        msg = "State is changed";
        notifyListener();
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
