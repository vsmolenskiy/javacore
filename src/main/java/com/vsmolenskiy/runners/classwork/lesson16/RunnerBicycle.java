package com.vsmolenskiy.runners.classwork.lesson16;

import com.vsmolenskiy.app.classwork.lesson16.AMCEBicycle;
import com.vsmolenskiy.app.classwork.lesson16.Bicycle;

/**
 * Created by student on 3/9/2017.
 */
public class RunnerBicycle {
    public static void main(String[] args) {
        Bicycle bicycle = new AMCEBicycle();
        bicycle.changeGear(2);
        AMCEBicycle amceBicycle = new AMCEBicycle();
        amceBicycle.changeGear(4);

    }
}
