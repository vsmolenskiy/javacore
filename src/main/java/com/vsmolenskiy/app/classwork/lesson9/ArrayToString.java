package com.vsmolenskiy.app.classwork.lesson9;

/**
 * Created by student on 2/13/2017.
 */
public class ArrayToString {
    String stringToDisplay ="";
   public String string(char[] array){
        for (int i =0;i < array.length;i++)
       {
           stringToDisplay += array[i];
       }
       return stringToDisplay; }
}
