package com.xinyu.javalearn.reflection.inter;

public class BaseClass {
    public int baseInt;

    public static void method3() {
        System.out.println("method 3");
    }

    public int method4() {
        System.out.println("method 4");
        return 1;
    }

    public static int method5() {
        System.out.println("method 5");
        return 1;
    }

    void method6() {
        System.out.println("method 6");
    }

    public class BaseClassInnerClass {
    }

}
