package com.xinyu.javalearn.event;

import java.util.EventListener;

public class SateChangeListener implements EventListener {
    public void handleEvent(MyEvent event) {
        System.out.println(event.toString() + " fire event " + event.getSourceMsg());
    }
}
