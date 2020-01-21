package practiceofcore.hashmap;


import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyCustomMapTest {
    private static MyCustomMap<String, String> myMap = new MyCustomMap<>();

    @BeforeClass
    public static void beforeClass() throws Exception {
        myMap.put("key","value");
    }

    @Test
    public void shouldAnswerWithTrue() {
        assertEquals(myMap.getSize(),1);
    }
}