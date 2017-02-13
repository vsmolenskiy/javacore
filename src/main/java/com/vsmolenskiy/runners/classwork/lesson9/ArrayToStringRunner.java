package com.vsmolenskiy.runners.classwork.lesson9;

import com.vsmolenskiy.app.classwork.lesson9.ArrayToString;

/**
 * Created by student on 2/13/2017.
 */
public class ArrayToStringRunner {
    public static void main(String[] args) {
        char[] array ={'4','7','a','5','g'};
        ArrayToString arrayToString = new ArrayToString();
        System.out.print(arrayToString.string(array));
    }
}
