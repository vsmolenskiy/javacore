package com.vsmolenskiy.booktasks.Game;

/**
 * Created by V.Smolenskyi on 28.02.2017.
 */
public class Player {
    int numder =0;
    public void guess(){
        numder = (int) (Math.random()*10);
        System.out.println("Думаю это число "+ numder);
    }
}
