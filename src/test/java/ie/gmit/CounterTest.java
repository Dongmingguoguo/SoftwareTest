package ie.gmit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.*;

public class CounterTest {
    Counter myCounter;

    @BeforeEach
    void init() {
        myCounter = new Counter();
    }

    @Test
    void testConstructor() {
        assertEquals(0, myCounter.getCount());
    }

    @Test
    void testIncre
}
