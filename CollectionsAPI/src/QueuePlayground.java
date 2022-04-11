import java.util.LinkedList;
import java.util.Queue;

public class QueuePlayground {

    // 1. FIFO First in first out
    public static void main(String[] args) {
        Person adam = new Person("Adam", "Ranieri", 19);
        Person bill = new Person("Bill", "Kris", 25);
        Person ted = new Person("Ted", "Smith", 22);

        Queue<Person> personQueue = new LinkedList();// LinkedList can be used to implement a queue
                                    // but it can only be interacted with like a Queue

        personQueue.add(adam);
        personQueue.add(bill);
        personQueue.add(ted);
        System.out.println(personQueue.poll());// adam
        System.out.println(personQueue.poll());// bill


    }
}
