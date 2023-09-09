package com.xinyu.javalearn.reflection.inter;

public class ConcreteClass extends BaseClass implements BaseInterface {

    public int publicInt;

    private String privateString = "private string";

    protected boolean protectedBoolean;

    Object defaultObject;

    public ConcreteClass(int publicInt) {
        this.publicInt = publicInt;
    }

    @Override
    public void method1() {
        System.out.println("method1 impl");
    }

    @Override
    public int method2(String str) {
        System.out.println("method2 impl");
        return 0;
    }

    @Override
    @Deprecated
    public int method4() {
        System.out.println("Method 4 override");
        return 0;
    }

    public int method5(int i) {
        System.out.println("Method 5 override");
        return 0;
    }

    public class ConcreteClassPublicClass {
    }

    private class ConcreteClassPrivateClass {
    }
}
