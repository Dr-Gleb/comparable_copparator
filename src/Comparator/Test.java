package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Worker> list = new ArrayList<>();
        list.add(new Worker(100,"Gleb","nefedov",5000));
        list.add(new Worker(101,"Gleb","asperov",5000));
        list.add(new Worker(25,"ivan","petrov",4000));
        list.add(new Worker(31,"petr","sidorov",2000));
        list.add(new Worker(14,"olga","polak",3000));
        System.out.println(list);
        Collections.sort(list,new NameComporator());
        System.out.println(list);
    }
}
class IdComparator implements Comparator<Worker>{
    @Override
    public int compare(Worker o1, Worker o2) {
        return o1.id- o2.id;
    }
}
class NameComporator implements  Comparator<Worker>{
    @Override
    public int compare(Worker o1, Worker o2) {
        int res=o1.name.compareTo(o2.name);
        if(res==0){
            return o1.surname.compareTo(o2.surname);
        }
        else return res;
    }
}
