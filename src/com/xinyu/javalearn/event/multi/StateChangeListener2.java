package com.xinyu.javalearn.event.multi;

public class StateChangeListener2 implements CallableEventListener {


    MyEvent2 myEvent2;

    public StateChangeListener2(MyEvent2 myEvent2) {
        this.myEvent2 = myEvent2;
    }

    @Override
    public String call() throws Exception {
        System.out.println("Listener - Processing");
        System.out.println("Listener - fire event " + myEvent2.getSourceMessage());
        return "SUCCESS";
    }
}
