package com.vsmolenskiy.app.classwork.lesson8;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.lang.reflect.Array;

/**
 * Created by student on 2/9/2017.
 */
public class SorteArray {
    public int[] array(int array){
        if (array.langth > 1){
        boolean flag =true;
        do {
            flag = false;
            for(int i=0,i<ARRAYLENGTH-1,i++){
                if (array[i]> array[i++]){
                    int temp = array[i];
                    array[i]=array[i++];
                    array(i++)=temp;
                    flag=true;
                }

            }
        } while (flag);
    }
}
