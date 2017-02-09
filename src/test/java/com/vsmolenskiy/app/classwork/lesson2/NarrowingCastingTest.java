package com.vsmolenskiy.app.classwork.lesson2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by student on 2/9/2017.
 */
public class NarrowingCastingTest {
  @Test
  public void narrowing(){
      NarrowingCasting narrowingCasting = new NarrowingCasting();
      assertEquals(0.1,narrowingCasting.narrowing(1.0f,0.1d),0.01);
   }
}