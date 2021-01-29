package fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzSpec {

    private FizzBuzz fb;

    @BeforeEach
    public void setUp() {
        fb = new FizzBuzz();
    }

    @Test
    public void testZero() {
        assertEquals("FizzBuzz", fb.fizzbuzz(0));
    }

    @Test
    public void testFive() {
        assertEquals("Buzz", fb.fizzbuzz(5));
    }

}
