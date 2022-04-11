import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPlayground {

    // Collections API/ Framework/ Hierarchy
    // Collections is a SUPER USEFUL package in Java that contains classes for the most common data structurees in programming
    // LIST
    // SET
    // QUEUE
    // MAP

    public static void main(String[] args) {
        // List is an interface that takes a generic
        // ArrayList is a class that implements list
        List<Person> peopleList = new LinkedList();

        Person adam = new Person("Adam", "Ranieri", 19);
        Person bill = new Person("Bill", "Kris", 25);
        Person ted = new Person("Ted", "Smith", 22);

        peopleList.add(adam);
        peopleList.add(bill);
        peopleList.add(ted);
        peopleList.add(adam);
        peopleList.add(adam);

        // A list stores objects by order of insertion
        // A list can have duplicates
        // can get a specific element by its index
        System.out.println(peopleList);
        System.out.println(peopleList.get(1));

        // add to the end of the list
        long start = System.nanoTime();
        for(int i = 0; i < 100000; i++){
            Person test = new Person("Joe", "McTestFace", 20);
            peopleList.add(test); // adds the elements to the end of the list
        }
        long end = System.nanoTime();
        long diff = end-start;
        System.out.println("Total time to add to end of list in seconds: " + diff/1_000_000_000.0);

        // retrieve object from middle of list 10,000
        start = System.nanoTime();
        for(int i = 0; i < 100000; i++){
          peopleList.get(5000);
        }
        end = System.nanoTime();
        diff = end-start;
        System.out.println("Total time to get from middle of list in seconds: " + diff/1_000_000_000.0);

        // Add to front of list
        start = System.nanoTime();
        for(int i = 0; i < 100000; i++){
            Person test2 = new Person("Test", "McTest", 10);
            peopleList.add(0,test2);
        }
        end = System.nanoTime();
        diff = end-start;
        System.out.println("Total time to add to front of list in seconds: " + diff/1_000_000_000.0);

        // ArrayList
//        Total time to add to end of list in seconds: 0.0100511
//        Total time to get from middle of list in seconds: 0.0039397
//        Total time to add to front of list in seconds: 1.7918138

        // LinkedList
//        Total time to add to end of list in seconds: 0.0098604
//        Total time to get from middle of list in seconds: 0.8193096
//        Total time to add to front of list in seconds: 0.0076422

    }

}
