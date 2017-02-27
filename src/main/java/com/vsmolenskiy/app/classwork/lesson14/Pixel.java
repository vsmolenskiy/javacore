package com.vsmolenskiy.app.classwork.lesson14;

/**
 * Created by student on 2/27/2017.
 */
public class Pixel {
    private int x;
    private int y;
    public Pixel(int x,int y ){
        this.x = x;
        this.y = y;
    }
    public  int[]getCoords(){
        int[] res = {x,y};
        return  res;
    }
}
