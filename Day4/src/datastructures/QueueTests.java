package datastructures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueTests {

    @Test
    void one_element(){
        String adam = "Adam";
        Queue<String> queue = new QueueImpl<String>();
        queue.add(adam);
        String retrived = queue.poll();
        Assertions.assertEquals("Adam",retrived);
    }

    @Test
    void three_elements(){
        String p1 = "Person 1";
        String p2 = "Person 2";
        String p3 = "Person 3";

        Queue<String> queue = new QueueImpl<String>();

        queue.add(p1);
        queue.add(p2);
        queue.add(p3);

        String r1 = queue.poll();
        String r2 = queue.poll();
        String r3 = queue.poll();

        Assertions.assertEquals("Person 1", r1);
        Assertions.assertEquals("Person 2", r2);
        Assertions.assertEquals("Person 3", r3);

    }
}
