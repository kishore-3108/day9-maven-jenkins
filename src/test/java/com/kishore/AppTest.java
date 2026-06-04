package com.kishore;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    
    @Test
    public void testAppMessage() {
        App app = new App();
        assertNotNull("App object create avvali", app);
        System.out.println("Test 1 Pass: App object created");
    }

    @Test
    public void testAddition() {
        int result = 2 + 3;
        assertEquals(10, result);
        System.out.println("Test 2 Pass: Addition correct");
    }
}
