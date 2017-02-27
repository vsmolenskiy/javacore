package com.vsmolenskiy.runners.homework.lesson12;

import com.vsmolenskiy.app.homework.lesson12.Human;

import java.util.Scanner;

/**
 * Created by V.Smolenskyi on 27.02.2017.
 */
public class RunnerHuman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String newname = scanner.nextLine();
        System.out.println("Введите возраст");
        int newage = scanner.nextInt();
        Human human = new Human(newname,newage);
        if(newage < 1 || newage > 120){
            System.out.println("Age invalid");
        }
        else {
            System.out.println("New age setted = " + human.getAge());
        }
       // int newage2 = Integer.valueOf(newage);




    }
}
