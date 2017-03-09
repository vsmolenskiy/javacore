package com.vsmolenskiy.runners.homework.lesson4;

import com.vsmolenskiy.app.classwork.lesson16.Number;
import com.vsmolenskiy.app.classwork.lesson16.Season;
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
        String go = "";
        while (indicator < 100) {
            System.out.println();
            System.out.println("Type 'ONE' if you want start program Circle Area\n" +
                                "Type 'TWO' if you want start program Even Odd\n" +
                                "Type 'THREE' if you want start program RightAngled\n" +
                                "Type 'EXIT' if you want exit");
            String programNumber = scanner.nextLine();
//            if (programNumber == 1) {
//                go = "ONE";
//            }
//            else if (programNumber == 2){
//                go = "TWO";
//            }
//            else if (programNumber == 3){
//                go = "THREE";
//            }
//            else if (programNumber == 4){
//                go = "EXIT";
//            }
//            else{
//
//            }
            Number number = Number.valueOf(programNumber);

            switch (number) {
                case ONE:
                    System.out.println();
                    RunnerCircleArea.main(args);
                    break;
                case TWO:
                    System.out.println();
                    RunnerEvenOdd.main(args);
                    break;
                case THREE:
                    System.out.println();
                    RunnerRightAngled.main(args);
                    break;
                case EXIT:
                    System.out.println();
                    System.out.println("Bye");
                    indicator = 101;
                    break;
                default:
                    System.out.println("Try again");
                    indicator++;
            }
    }}}