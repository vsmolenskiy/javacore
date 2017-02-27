package com.vsmolenskiy.app.classwork.lesson13;

/**
 * Created by student on 2/27/2017.
 */
public class Teacher extends Person {
    private String question = "what I sad before ?";
    public Teacher(String name,String question){
    super(name);
    this.question = question;
    }
    final public void  StartLesson(){
        System.out.println("Lets start");
    }
}
