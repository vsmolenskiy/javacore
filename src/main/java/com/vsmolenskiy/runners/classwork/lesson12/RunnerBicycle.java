package com.vsmolenskiy.runners.classwork.lesson12;

import com.vsmolenskiy.app.classwork.lesson12.Bicycle;

/**
 * Created by student on 2/23/2017.
 */
public class RunnerBicycle {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(1500);
        System.out.println("maxspeed: " + bicycle.maxspeed+" "+"color: "
                + bicycle.color +" wheelsize:"+bicycle.wheelsize);
    }
}
