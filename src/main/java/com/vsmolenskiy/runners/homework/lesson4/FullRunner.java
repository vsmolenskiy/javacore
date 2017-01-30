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
        int indicator = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type 1 if you want lunch program Circle Area");
        System.out.println("Type 2 if you want lunch program Even Odd");
        System.out.println("Type 3 if you want lunch program RightAngled");
        System.out.println("Type 4 if you want exit");
        int programNumber = scanner.nextInt();

        switch (programNumber == 1) {
                RunnerCircleArea.main(args);
            }
            else if (programNumber == 2) {
                RunnerEvenOdd.main(args);
            }
            else if (programNumber == 3) {
                RunnerRightAngled.main(args);
            }
            else {
            System.out.println("Try again");
            programNumber = scanner.nextInt();}
    }
}