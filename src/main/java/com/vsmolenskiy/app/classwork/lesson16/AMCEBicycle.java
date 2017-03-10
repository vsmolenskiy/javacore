package com.vsmolenskiy.app.classwork.lesson16;

/**
 * Created by student on 3/9/2017.
 */
public class AMCEBicycle implements Bicycle {
    int speed = 1;
    int cadence = 1;
    int gear = 2;
    @Override
    public void changeCadence(int newValue) {
        this.cadence = newValue;
    }

    @Override
    public void changeGear(int newValue) {
        this.gear = newValue;

    }
    public void  printStats(){
        System.out.println(cadence + gear);

    }
}
