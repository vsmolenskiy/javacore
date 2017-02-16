package com.vsmolenskiy.app.classwork.lesson10;

import com.vsmolenskiy.app.classwork.lesson9.ArrayToString;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by student on 2/16/2017.
 */
public class FindAllWordsInString {
    public static void main(String[] args){
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] splittedStringArray = inputString.split(",");
        int[] intArray = new int[splittedStringArray.length];
        for(int i =0;i<splittedStringArray.length;i++)
            intArray[i] = Integer.valueOf(splittedStringArray[i]);
        System.out.println(Arrays.toString(splittedStringArray).replace("["," ").replace("]"," "));
    }

}
