package com.vsmolenskiy.app.Lesson2;

/**
 * Created by V.Smolenskyi on 20.01.2017.
 */
public class NarrowingCasting {
    double double1 = 3.14159d;
    float float1 = 0.0f;
    public void narrowing(){
        float1 = (float) double1;
        System.out.println(float1);
    }
}
