package com.vsmolenskiy.app.classwork.lesson15;

/**
 * Created by student3 on 3/6/2017.
 */
public class Parent {
    int a;
    int b;

    public int sum() {
        return a;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Parent)) {
            return false;
        }
        Parent parent = (Parent)o;
        return a == parent.a && b == parent.b;

    }
}