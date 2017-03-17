package com.vsmolenskiy.app.homework.lesson6;

import java.util.Arrays;

/**
 * Created by V.Smolenskyi on 15.03.2017.
 */
public class EvenOddArray {
    int[] even = {2,4,6,8,10,12,14,16,18,20};
    int[] odd = {1,3,5,7,9,11,13,15,17,19};
    int[] hundred;
    public void sort(){
        for (int i=0; i<even.length; i++){
            System.out.println(even[i]);
        }
        System.out.println(Arrays.toString(even));
        for (int i=0; i<odd.length; i++){
            System.out.println(odd[i]);
        }
        System.out.println(Arrays.toString(odd));
        for (int i=0; i<hundred.length; i++){
            hundred[i]=i;
        }
        System.out.println(Arrays.toString(hundred));
    }
}
