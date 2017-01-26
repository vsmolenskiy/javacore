package com.vsmolenskiy.app.classwork.lesson3;

import org.junit.Assert;
import org.junit.Test;

import org.junit.Assert.*;

/**
 * Created by student on 1/23/2017.
 */
public class MainMathFuncTest {
    @Test
    public void multiply() {
        MathFunc mathFunc = new MathFunc();
        Assert.assertEquals(6,mathFunc.multiply(2, 3));

    }

}