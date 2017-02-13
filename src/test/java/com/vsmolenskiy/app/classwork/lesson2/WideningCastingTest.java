package com.vsmolenskiy.app.classwork.lesson2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by student on 2/9/2017.
 */
public class WideningCastingTest {
    @Test
    public void widening(){
        short short1=0;
        byte byte1=122;
        WideningCasting wideningCasting = new WideningCasting();
        assertEquals(122,wideningCasting.widening(127,0,0,0,short1,byte1),0.001);
    }

}