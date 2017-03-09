package company.lesson15;

import java.util.Scanner;

/**
 * Created by student3 on 3/6/2017.
 */
public class Runner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Parent child1 = new Child1();
        Parent child2 = new Child2();
        Parent parent = new Parent();
        System.out.println(child1.sum() + "\n" + child2.sum() +"\n" +parent.sum() + "\n" + child1.equals(child2));

    }

}
