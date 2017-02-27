package com.vsmolenskiy.app.homework.lesson12;

/**
 * Created by V.Smolenskyi on 27.02.2017.
 */
public class Human {
   private String name;
   private int age;
    public Human(String name,int age){
        this.name = name;
        this.age = age;
    }
    public int gerAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){

        if(age < 1 || age > 120){
            System.out.println("Age invalid");
        }
        else {
            this.age = age;
            System.out.println("New age setted");
        }
    }
}
