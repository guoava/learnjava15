package com.xinyu.javalearn.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calc {
    public Calc() {
    }

    // Integer.TYPE
    public int add(int a, int b) {
        return a + b;
    }

    // Integer.class
    public int add(Integer a, Integer b) {
        return a + b;
    }

    private int times(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("com.xinyu.javalearn.reflection.Calc");
            Method add = aClass.getMethod("add", new Class[]{Integer.TYPE, Integer.TYPE});
//            Method add = aClass.getMethod("add", new Class[]{Integer.class, Integer.class});
            Calc calc = (Calc) aClass.newInstance();

            Object invoke = add.invoke(calc, new Object[]{new Integer(10), new Integer(52)});
            System.out.println("invoke = " + invoke);

            // times is private , getMethod cant obtain
//            Method times = aClass.getMethod("times", int.class, int.class);
            Method times = aClass.getDeclaredMethod("times", int.class, int.class);
            Object invoke1 = times.invoke(calc, new Object[]{new Integer(10), new Integer(52)});
            System.out.println("invoke1 = " + invoke1);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

}
