package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Worker> list = new ArrayList<>();
        list.add(new Worker(100,"Gleb","Nefedov",5000));
        list.add(new Worker(25,"ivan","petrov",4000));
        list.add(new Worker(31,"petr","sidorov",2000));
        list.add(new Worker(14,"olga","polak",3000));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list);
    }
}
