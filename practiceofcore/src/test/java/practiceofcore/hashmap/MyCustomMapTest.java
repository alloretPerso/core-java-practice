package practiceofcore.hashmap;


import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyCustomMapTest {
    private static MyCustomMap<String, String> myMap = new MyCustomMap<>();

    @BeforeClass
    public static void beforeClass() {
        myMap.put("key", "value");
    }

    @Test
    public void checkSize() {
        assertEquals(1, myMap.getSize());
    }

    @Test
    public void checkValue() {
        assertEquals("value", myMap.get("key"));
    }
}