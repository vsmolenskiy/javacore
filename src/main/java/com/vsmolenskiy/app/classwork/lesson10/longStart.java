package com.vsmolenskiy.app.classwork.lesson10;

/**
 * Created by student on 2/16/2017.
 */
public class longStart {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String c = "start";
        String b = "finish";
        for (long i = 0; i < 100000L; i++){ c = c.concat(b);}
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
