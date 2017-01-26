package com.vsmolenskiy.app.homework.lesson3.units.convertors;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by V.Smolenskyi on 26.01.2017.
 */
public class MathTest {
    @Test
    public void abc(){
        Math math = new Math();
        Assert.assertEquals(2,math.abc(2));
    }
    @Test
    public void cbrt(){
        Math math = new Math();
        Assert.assertEquals(3,math.cbrt(27));
    }
    @Test
    public void seil(){
        Math math = new Math();
        Assert.assertEquals(6,math.ceil(5));

    }
    @Test
    public void copySign(){
        Math math = new Math();
        Assert.assertEquals(27,math.copySign(27,1));

    }
    @Test
    public void cos() {
        Math math = new Math();
        Assert.assertEquals( 1, math.cos(0));
    }
    @Test
    public void decrementExact() {
        Math math = new Math();
        Assert.assertEquals(5, math.decrementExact(6));
    }
    @Test
    public void incrementExact() {
        Math math = new Math();
        Assert.assertEquals(7, math.incrementExact(6));
    }
    @Test
    public void max() {
        Math math = new Math();
        Assert.assertEquals(8, math.max(6,8));
    }
    @Test
    public void min() {
        Math math = new Math();
        Assert.assertEquals(2, math.min(34,2));
    }
    @Test
    public void negateExact(){
        Math math = new Math();
        Assert.assertEquals(-4,math.negateExact(4));

    }
    @Test
    public void subtractExact() {
        Math math = new Math();
        Assert.assertEquals(32, math.subtractExact(34,2));
    }
    @Test
    public void division() {
        Math math = new Math();
        Assert.assertEquals(2, math.division(4,2));
    }
    @Test
    public void division1() {
        Math math = new Math();
        Assert.assertEquals(0.5, math.division(4,8));
    }
    @Test
    public void sum() {
        Math math = new Math();
        Assert.assertEquals(6, math.sum(4,2));
    }
    @Test
    public void sum1() {
        Math math = new Math();
        Assert.assertEquals(4, math.sum(6,-2));
    }
    @Test
    public void subtractExact1() {
        Math math = new Math();
        Assert.assertEquals(-2, math.subtractExact(8,10));
    }
    @Test
    public void negateExact1(){
        Math math = new Math();
        Assert.assertEquals(14,math.negateExact(-14));

    }
    @Test
    public void max1() {
        Math math = new Math();
        Assert.assertEquals(5, math.max(5,3));
    }
    @Test
    public void min1() {
        Math math = new Math();
        Assert.assertEquals(2, math.min(-34,2));
    }
    @Test
    public void abc1(){
        Math math = new Math();
        Assert.assertEquals(-2,math.abc(-2));
    }
}