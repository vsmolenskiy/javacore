package com.vsmolenskiy.app.classwork.lesson5;

import com.vsmolenskiy.app.classwork.lesson3.MathFunc;
import junitparams.FileParameters;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by student on 1/30/2017.
 */
@RunWith(JUnitParamsRunner.class)
public class ParametrizedTests {
    MathFunc mathFunc;
    @BeforeClass
    public  void setUpClass(){
        mathFunc = new MathFunc();
    }

    @Test
    @FileParameters(value = "src/test/resources/testdata.csv", mapper = CsvWithHeaderMapper.class)
    public void multiplyTest(int a, int b, int expected){
        Assert.assertEquals(expected, mathFunc.multiply(a,b));
    }

    @AfterClass
    public  void tearDownClass(){

    }

}
