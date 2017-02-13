package com.vsmolenskiy.app.classwork.lesson9;

/**
 * Created by student on 2/13/2017.
 */
public class PrimitiveToString {
    public static void convert() {
        int int1 = 538627865;
        boolean boolean1 = true;
        double double1 = 1945.58973474;
        long long1 = 31715613;
        String display = String.valueOf(int1);
        String display2 = String.valueOf(boolean1);
        String display3 = String.valueOf(double1);
        String display4 = String.valueOf(long1);

        int1 = Integer.valueOf(display);
        boolean1 = Boolean.valueOf(display2);
        double1 = Double.valueOf(display3);
        long1 = Long.valueOf(display4);
        System.out.print(int1);
        System.out.print(boolean1);
        System.out.print(double1);
        System.out.print(long1);

    }
}