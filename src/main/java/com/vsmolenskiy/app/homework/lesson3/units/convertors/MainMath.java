package com.vsmolenskiy.app.homework.lesson3.units.convertors;
/**
 * Created by V.Smolenskyi on 26.01.2017.
 */
public class MainMath {
    public int abs (int a)
    {
        return Math.abs(a);
    }
    public double cbrt (double a)
    {
        return Math.cbrt(a);
    }
    public double ceil (double a){
        return Math.ceil(a);
    }
    public double copySign (double magnitude, double sign){
        return Math.copySign(magnitude,sign);
    }
    public double cos (double a){
        return Math.cos(a);
    }
    public int decrementExact (int a){
        return a-1;
    }
    public int incrementExact(int a){
        return a+1;
    }
    public double max(double a, double b){
        return Math.max(a,b);
    }
    public double min(double a, double b){
        return Math.min(a,b);
    }
    public int negateExact(int a){
        return Math.negateExact(a);
    }
    public int subtractExact(int x, int y){
        return x - y;
    }
    public double division(double a, double b){
        return a/b;
    }
    public int sum(int a, int b){
        return a + b;
    }

}
