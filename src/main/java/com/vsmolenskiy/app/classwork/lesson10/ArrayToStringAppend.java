package com.vsmolenskiy.app.classwork.lesson10;

/**
 * Created by student on 2/16/2017.
 */
public class ArrayToStringAppend {
    public static void main(String[] args) {

        char[] charArrayToString = {'a', 't', 'y', 's'};
        StringBuilder builder = new StringBuilder();
        for (char value : charArrayToString) {
            builder.append(value);

        }
    }
}
