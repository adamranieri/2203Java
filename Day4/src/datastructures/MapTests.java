package datastructures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MapTests {

    @Test
    void one_key_one_value(){

        Map<String, Double> map = null;
        map.put("pi", 3.14);

        Double value = map.get("pi");
        Assertions.assertEquals(3.14, value);

    }
}
