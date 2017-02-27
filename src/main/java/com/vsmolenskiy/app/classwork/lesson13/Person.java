package com.vsmolenskiy.app.classwork.lesson13;

/**
 * Created by student on 2/27/2017.
 */
public class Person {
    int thinkSpeed;
    protected String name;
    protected boolean education;
    public Person(String name){
        this.name = name;
    }
    final public int head (int think){
        thinkSpeed = thinkSpeed*45;
        return thinkSpeed;
    }
}
