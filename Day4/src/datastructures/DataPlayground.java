package datastructures;

import java.util.ArrayList;
import java.util.List;

public class DataPlayground {
    public static void main(String[] args) {
        // Collections is a framework of Data Structures in Java
        // List, Set, Map, Queue, Stack - Collections
        // Collections: Data Structures that hold other objects

        //List is an interface!, ArrayList is an implementation of List
        List<String> names = new ArrayList<String>();
        names.add("Bill");
        names.add("Steve");
        names.add("Mark");
        System.out.println(names);
        System.out.println(names.get(2));

    }
}
