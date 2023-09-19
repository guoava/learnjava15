package com.xinyu.javalearn.generics.extend;

import java.util.ArrayList;
import java.util.List;

public class CovariantWriter<T> {

    // 该类型或者父类型
    void write(List<? super T> list, T item) {
        list.add(item);
    }

    public static void main(String[] args) {
        List<String> str = new ArrayList<String>();
        List<Object> obj = new ArrayList<Object>();

        CovariantWriter<String> strWriter = new CovariantWriter<String>();
        strWriter.write(obj, "Test");
        strWriter.write(str, "Test");
    }

}
