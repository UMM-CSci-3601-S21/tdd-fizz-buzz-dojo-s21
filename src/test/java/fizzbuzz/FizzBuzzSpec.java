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

    @Test
    public void testThree() {
        assertEquals("Fizz", fb.fizzbuzz(3));
    }

    @Test
    public void testFour() {
        assertEquals("4", fb.fizzbuzz(4));
    }

    @Test
    public void testSeven() {
        assertEquals("7", fb.fizzbuzz(7));
    }

    @Test
    public void testSix() {
        assertEquals("Fizz", fb.fizzbuzz(6));
    }
}
