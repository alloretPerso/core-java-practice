package practiceofcore.hashmap;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyMapTest {
    private MyMap<String, String> myMap = new MyMap<>();
    @Test
    public void shouldAnswerWithTrue() {
        myMap.put("key","value");
        assertEquals(null, myMap.get("key"));
    }
}