package com.vsmolenskiy.app.classwork.lesson13;

/**
 * Created by student on 2/27/2017.
 */
public class Student extends Person {
    private String university;
    private String response = "Ehh, what was the question?";
    public  Student (String name, String university){
        super(name);
        this.university = university;
    }
    public String getResponse(String question){
        return response;
    }
}
