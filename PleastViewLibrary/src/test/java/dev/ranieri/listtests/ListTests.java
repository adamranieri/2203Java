package dev.ranieri.listtests;

import dev.ranieri.utilities.ArrayList;
import dev.ranieri.utilities.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ListTests {

    @Test
    void add_items_size(){
        List<String> names = new ArrayList();
        names.add("A");
        names.add("B");
        names.add("C");
        Assertions.assertEquals(3, names.size());
    }

    @Test
    void get_by_index(){
        List<String> names = new ArrayList();
        names.add("A");
        names.add("B");
        names.add("C");
        String result = names.get(1);
        Assertions.assertEquals("B", result);
    }

    @Test
    void many_adds(){
        List<String> names = new ArrayList();
        for(int i = 0; i <1000; i++){
            names.add("hello");
        }
        Assertions.assertEquals(1000,names.size());
    }

}
