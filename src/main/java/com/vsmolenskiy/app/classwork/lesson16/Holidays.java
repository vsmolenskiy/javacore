package com.vsmolenskiy.app.classwork.lesson16;

/**
 * Created by student on 3/9/2017.
 */
public enum Holidays {
    NEW_YEAR(1, "January", "New Year"),
    MAY(1,"May","First of May");

    private int date;
    String manth;
    String fulltext;
    private Holidays(int date,String math,String fulltest){
        this.date = date;
        this.manth = math;
        this.fulltext = fulltest;

    }
}