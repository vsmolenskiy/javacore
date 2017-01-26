package com.vsmolenskiy.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by student on 1/26/2017.
 */
public class RightAngled {
    public static void checkTruth() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print side1");
        double side1 = scanner.nextDouble();
        System.out.println("Print side2");
        double side2 = scanner.nextDouble();
        System.out.println("Print side3");
        double side3 = scanner.nextDouble();
        if(side1*side1 + side2*side2 == side3*side3 || side2*side2 + side3*side3 == side1*side1 || side3*side3 + side1*side1 == side2*side2)

        System.out.println("Yeas the triangel is Right-angled");

        else
            System.out.println("No the triangel");
    }
}
