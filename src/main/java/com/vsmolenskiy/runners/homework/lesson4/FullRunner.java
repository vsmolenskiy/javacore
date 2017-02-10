package com.vsmolenskiy.runners.homework.lesson4;

import com.vsmolenskiy.app.classwork.lesson4.CircleArea;
import com.vsmolenskiy.app.classwork.lesson4.EvenOdd;
import com.vsmolenskiy.app.classwork.lesson4.RightAngled;
import com.vsmolenskiy.runners.classwork.lesson4.RunnerCircleArea;
import com.vsmolenskiy.runners.classwork.lesson4.RunnerRightAngled;

import java.util.Scanner;

/**
 * Created by V.Smolenskyi on 30.01.2017.
 */
public class FullRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int indicator = 0;
        while (indicator < 1000) {
            System.out.println();
            System.out.println("Type 1 if you want start program Circle Area\n" +
                                "Type 2 if you want start program Even Odd\n" +
                                "Type 3 if you want start program RightAngled\n" +
                                "Type 4 if you want exit");
            int programNumber = scanner.nextInt();

            if (programNumber == 1) {
                System.out.println();
                RunnerCircleArea.main(args);
            } else if (programNumber == 2) {
                System.out.println();
                RunnerEvenOdd.main(args);
            } else if (programNumber == 3) {
                System.out.println();
                RunnerRightAngled.main(args);
            } else if (programNumber == 4){
                System.out.println();
                System.out.println("Bye");
                indicator = 1001;
            }
            else {
                System.out.println("Try again");
            }
         indicator++;}
    }
}