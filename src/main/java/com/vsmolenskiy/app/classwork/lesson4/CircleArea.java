package com.vsmolenskiy.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by student on 1/26/2017.
 */

public class CircleArea {
    public static final double PI = 3.14d;
    public static void calculateBigger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type radius1 and press Enter");
        double radius1 = scanner.nextDouble();
        double circleArea1= PI*Math.pow(radius1,2);
        System.out.println("Type radius2 and press Enter");
        double radius2 = scanner.nextDouble();
        double circleArea2= PI*Math.pow(radius2,2);
        if (circleArea1 > circleArea2)
            System.out.print("Area1 is bigger...");
        else
            System.out.print("Area2 is bigger...");
    }
}
