package com.vsmolenskiy.runners.classwork.lesson2;

import com.vsmolenskiy.app.classwork.lesson2.WideningCasting;

/**
 * Created by student on 2/6/2017.
 */
public class RunnerWideningCasting {
    public static void main(String[] args) {
        WideningCasting casting = new WideningCasting();
        byte byte1 = 127;
        short short1 = 0;
        int int1 = 0;
        long long1 = 0L;
        float float1 = 0.0f;
        double double1 = 0.0d;
        System.out.println(casting.widening( double1, float1, long1, int1, short1, byte1));
    }

}
