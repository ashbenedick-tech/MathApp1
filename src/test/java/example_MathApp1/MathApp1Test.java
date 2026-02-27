package example_MathApp1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathApp1Test {

    @Test
    void testMax() {
        assertEquals(15, MathApp1.max(5, 15));
        assertEquals(37, MathApp1.max(37, -11));
        assertEquals(10, MathApp1.max(10, 10));
    }

    @Test
    void testAverage() {
        assertEquals(10.0, MathApp1.average(5, 15));
        assertEquals(13.0, MathApp1.average(37, -11));
        assertEquals(10.0, MathApp1.average(10, 10));
    }



}
