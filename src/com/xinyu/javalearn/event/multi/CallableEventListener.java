package com.xinyu.javalearn.event.multi;

import java.util.EventListener;
import java.util.concurrent.Callable;

public interface CallableEventListener extends EventListener, Callable<String> {

}
