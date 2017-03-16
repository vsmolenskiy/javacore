package com.vsmolenskiy.runners.classwork.lesson18;
import java.util.*;

/**
 * Created by student on 3/16/2017.
 */
public class ColectionsRunner {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        Map map1 = new HashMap();
        for (int i = 0; i < 100000; i++){
            System.out.println("Type 1 to List add");
            System.out.println("Type 2 to Set add");
            System.out.println("Type exit to exit");
        String s = new String(scanner.nextLine());
        switch (s) {
            case "1":
                System.out.println("Type 3 values to list");
                for (int j = 0; j < 3; j++) {
                    String string1 = scanner.nextLine();
                    myList.add(string1);
                }
                System.out.println(myList);
                break;

            case "2":
                HashSet hs = new HashSet();
                System.out.println("Type 10 values to Set");
                for (int j = 0; j < 10; j++) {
                    hs.add(scanner.nextLine());
                }
                System.out.println(hs);
                    map1.put(scanner.nextLine(), hs);

                System.out.println(map1.get(scanner.nextLine()));
                break;
            case "exit":
                System.out.println("By");
                i = 100000;
        }
        }
    }
}
