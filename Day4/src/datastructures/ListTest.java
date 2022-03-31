package datastructures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// Your tests focus on results
// DO NOT TEST IMPLEMENTATION
// Tests should be concerned with the correct output of a method
// Not with trying to see HOW something works
public class ListTest {

    @Test
    void add_elements(){
        List<String> robots = new ArrayList<String>();
        robots.add("Bender");
        robots.add("R2D2");
        robots.add("Wall-E");
        Assertions.assertEquals(3,robots.size());
    }

    @Test
    void many_elements(){
        List<String> robots = new ArrayList<String>();
        for(int i =0; i <1001;i++){
            robots.add("Bender");
        }
        Assertions.assertEquals(1001,robots.size());
    }

    @Test
    void get_by_index(){
        List<String> robots = new ArrayList<String>();
        robots.add("Bender");
        robots.add("R2D2");
        robots.add("Wall-E");
        String r2d2 = robots.get(1);
        Assertions.assertEquals("R2D2", r2d2);
    }

}
