package Collections;

import java.util.ArrayList;
import java.util.Collections;


public class ListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(60);
        list.add(40);

        list.remove(1);
        System.out.println(list.contains(400));
        list.add(66);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);



    }
}

