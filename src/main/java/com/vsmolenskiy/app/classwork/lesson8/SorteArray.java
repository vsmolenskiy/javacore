package com.vsmolenskiy.app.classwork.lesson8;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.lang.reflect.Array;

/**
 * Created by student on 2/9/2017.
 */
public class SorteArray {
    public static void sort() {
        int j;
        boolean swapFlag = true;
        int tempInt;
        int[] intArray = {3, 8, 11, 7, 10, 2};
        for (int i = 1; i < intArray.length; i++)
            System.out.print(intArray[i] + "");
        System.out.print("");
        while (swapFlag) {
            swapFlag = false;
            for (j = 0; j < intArray.length - 1; j++) {
                if (intArray[j] < intArray[j + 1]) {
                    tempInt = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = tempInt;
                    swapFlag = true;
                }
            }
        }
        for (int i = 0; i < intArray.length; i++)
            System.out.print(intArray[i] + "");
        System.out.print("");
    }
}
