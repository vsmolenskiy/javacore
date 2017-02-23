package com.vsmolenskiy.runners.classwork.lesson12;

import com.vsmolenskiy.app.classwork.lesson12.GetterAndSetter;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by student on 2/23/2017.
 */
public class GetterAndSetterRunnre {
    public static void main(String[] args) {
        GetterAndSetter getterAndSetter = new GetterAndSetter();
        System.out.println(getterAndSetter.getResponse());
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        getterAndSetter.setResponse(value);
        System.out.println(getterAndSetter.getResponse());
    }
}
