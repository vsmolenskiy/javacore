package com.vsmolenskiy.app.classwork.lesson5;

import com.vsmolenskiy.app.classwork.lesson3.MathFunc;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.*;
import org.junit.runner.RunWith;

/**
 * Created by student on 1/30/2017.
 */
@RunWith(JUnitParamsRunner.class)
public class ParametrizedTests {
     MathFunc mathFunc;
    @Before
    public  void setUp(){
        mathFunc = new MathFunc();
    }
    @Test
    @FileParameters(value = "src/test/resources/multiplyData.txt", mapper = CsvWithHeaderMapper.class)
    public void multiplyTest(int a, int b, int expected){
        Assert.assertEquals(expected, mathFunc.multiply(a,b));
    }
}