package com.xinyu.javalearn.classloader.my;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyClassTest {
    public static void main(String[] args) {
        MyClassloader loader = new MyClassloader();
        MyClassloaderTwo loaderTwo = new MyClassloaderTwo();
        try {
            Class<?> aClass = loader.findClass("com.xinyu.javalearn.classloader.my.MyClass");
            Method showMethod = aClass.getMethod("show");
            Object obj = aClass.newInstance();
            showMethod.invoke(obj);

            Class<?> aClassTwo = loaderTwo.findClass("com.xinyu.javalearn.classloader.my.MyClass");
            Object objTwo = aClassTwo.newInstance();
            for (Method method : aClassTwo.getMethods()) {
                if ("invokeAnotherObjShow".equals(method.getName())) {
                    method.invoke(objTwo, objTwo);
                    // 两个不同的classLoader有隔离
                    method.invoke(objTwo, obj);
                    method.invoke(obj, obj);
                }
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
