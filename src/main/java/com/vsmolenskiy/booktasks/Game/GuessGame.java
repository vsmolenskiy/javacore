package com.vsmolenskiy.booktasks.Game;

/**
 * Created by V.Smolenskyi on 28.02.2017.
 */
public class GuessGame {
    Player p1;
    Player p2;
    Player p3;
    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int tagertNumber = (int) (Math.random()*10);
        System.out.println("я загадіваю чисто от 0 до 9 ...");
        while (true){
            System.out.println("Число, которое нужно угадать, - "+ tagertNumber);
            p1.guess();
            p2.guess();
            p3.guess();
            if(guessp1 == tagertNumber){
                p1isRight = true;
            }
            if(guessp2 == tagertNumber){
                p2isRight = true;
            }
            if(guessp3 == tagertNumber){
                p3isRight = true;
            }
            if(p1isRight||p2isRight||p3isRight){
                System.out.println("У нас есть победитель!");
                System.out.println("Первый игрок угадал?"+ p1isRight);
                System.out.println("Второй игрок угадал?"+ p2isRight);
                System.out.println("Третий игрок угадал?"+ p3isRight);
                System.out.println("Конец игры");
                break;
            } else {
                System.out.println("Игроки должны попробовать еще раз!");
            }
        }
    }
}
