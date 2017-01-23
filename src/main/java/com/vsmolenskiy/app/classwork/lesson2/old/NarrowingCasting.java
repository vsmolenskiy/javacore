package com.vsmolenskiy.app.classwork.lesson2.old;

/**
 * Created by student on 1/19/2017.
 */
public class NarrowingCasting {
    int int1 = 0;
    float float1 = 3.14159f;

    public void narrowing(){
        int1 = (int) float1;
        System.out.println(int1);
    }
}
