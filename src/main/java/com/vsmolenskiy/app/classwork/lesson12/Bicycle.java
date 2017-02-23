package com.vsmolenskiy.app.classwork.lesson12;

/**
 * Created by student on 2/23/2017.
 */
public class Bicycle {

   public int wheelsize;
    public double  maxspeed;
    public  String color;
 public Bicycle(){
     this.wheelsize = 12;
     this.color = "green";
     this.maxspeed = 120.2;
 }
 public Bicycle(double maxspeed){
     this();
     this.maxspeed = maxspeed;
 }
}