package com.vsmolenskiy.runners.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by student on 1/26/2017.
 */
public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value... ");
        int value = (int) scanner.nextDouble();
        if(((int)(value / 2)) * 2 >= value){
       // if(value % 2 == 0){
            System.out.println("Entered value is even");
        }
        else System.out.println("Entered value is odd");
    }
}
