import java.util.Deque;
import java.util.LinkedList;

public class DequePlayground {

    // Modern Java applications do not use a Stack for LIFO
    // Deque which supports Last in First Out and also support FIFO
    // Deque tends to be used instead of queue a lot
    public static void main(String[] args) {
        Person adam = new Person("Adam", "Ranieri", 19);
        Person bill = new Person("Bill", "Kris", 25);
        Person ted = new Person("Ted", "Smith", 22);

        Deque<Person> personDeque = new LinkedList();// linkedlist can be used as an implementation
        personDeque.add(adam);
        personDeque.add(bill);
        personDeque.add(ted);
        System.out.println(personDeque.pollLast());// ted pop will remove the top of the stack (last person added)

    }

}
