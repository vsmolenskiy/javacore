package com.vsmolenskiy.runners.classwork.lesson2;

import com.vsmolenskiy.app.classwork.lesson2.NarrowingCasting;

/**
 * Created by V.Smolenskyi on 20.01.2017.
 */
public class Runner {
    public  static void main(String args[]){
        NarrowingCasting casting = new NarrowingCasting();
        float float1 = 1.0f;
        double double1 =0.1d;
        System.out.println(casting.narrowing(float1,double1));
    }
}
