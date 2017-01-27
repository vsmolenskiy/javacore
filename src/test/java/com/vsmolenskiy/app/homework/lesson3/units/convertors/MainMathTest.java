package com.vsmolenskiy.app.homework.lesson3.units.convertors;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by V.Smolenskyi on 26.01.2017.
 */
public class MainMathTest {
     @Test
     public void abs(){
         MainMath math = new MainMath();
         Assert.assertEquals(2,Math.abs(2));
     }
    @Test
    public void cbrt(){
        MainMath math = new MainMath();
        Assert.assertEquals(3,math.cbrt(27),0.00001);
    }
    @Test
    public void seil(){
        MainMath math = new MainMath();
        Assert.assertEquals(6,math.ceil(5.5),0.001);

    }
    @Test
    public void copySign(){
        MainMath math = new MainMath();
        Assert.assertEquals(27,math.copySign(27,1),0.000001);

    }
    @Test
    public void cos() {
        MainMath math = new MainMath();
        Assert.assertEquals( 1, math.cos(0), 0.000001);
    }
    @Test
    public void decrementExact() {
        MainMath math = new MainMath();
        Assert.assertEquals(5, math.decrementExact(6));
    }
    @Test
    public void incrementExact() {
        MainMath math = new MainMath();
        Assert.assertEquals(7, math.incrementExact(6));
    }
    @Test
    public void max() {
        MainMath math = new MainMath();
        Assert.assertEquals(8, math.max(6,8),0.000001);
    }
    @Test
    public void min() {
        MainMath math = new MainMath();
        Assert.assertEquals(2, math.min(34,2),0.000001);
    }
    @Test
    public void negateExact(){
        MainMath math = new MainMath();
        Assert.assertEquals(-4,math.negateExact(4));

    }
    @Test
    public void subtractExact() {
        MainMath math = new MainMath();
        Assert.assertEquals(32, math.subtractExact(34,2));
    }
    @Test
    public void division() {
        MainMath math = new MainMath();
        Assert.assertEquals(2, math.division(4,2),0.000001);
    }
    @Test
    public void division1() {
        MainMath math = new MainMath();
        Assert.assertEquals(0.5, math.division(4,8),0.000001);
    }
    @Test
    public void sum() {
        MainMath math = new MainMath();
        Assert.assertEquals(6, math.sum(4,2));
    }
    @Test
    public void sum1() {
        MainMath math = new MainMath();
        Assert.assertEquals(4, math.sum(6,-2));
    }
    @Test
    public void subtractExact1() {
        MainMath math = new MainMath();
        Assert.assertEquals(-2, math.subtractExact(8,10));
    }
    @Test
    public void negateExact1(){
        MainMath math = new MainMath();
        Assert.assertEquals(14,math.negateExact(-14));

    }
    @Test
    public void max1() {
        MainMath math = new MainMath();
        Assert.assertEquals(5, math.max(5,3),0.000001);
    }
    @Test
    public void min1() {
        MainMath math = new MainMath();
        Assert.assertEquals(-34, math.min(-34,2),0.000001);
    }

     @Test
     public void abs1(){
        MainMath math = new MainMath();
        Assert.assertEquals(2,math.abs(-2));
    }
}