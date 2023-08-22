package com.xinyu.javalearn.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InitProcessor {
    public static void main(String[] args) {
        new InitProcessor().process();
    }

    public void process() {
        try {
            Class<?> initDemoClazz = Class.forName("com.xinyu.javalearn.annotation.InitDemo");
            for (Method method : initDemoClazz.getMethods()) {
                if (method.isAnnotationPresent(InitMethod.class)) {
                    System.out.println("Method:" + method.getName() + " has InitMethod annotation.");
                    method.invoke(initDemoClazz.getDeclaredConstructor().newInstance());
                }
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } finally {
        }
    }

}
