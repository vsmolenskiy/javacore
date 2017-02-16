package com.vsmolenskiy.app.classwork.lesson10;

/**
 * Created by student on 2/16/2017.
 */
public class StringBuildetCut {
    public static void main(String[] args) {
        StringBuilder builder = new
                StringBuilder("start");
        int startInclusive = 2;
        int endExclusive = 4;
        builder.delete(startInclusive, endExclusive);

        System.out.print(builder.toString());
        
    }
}
