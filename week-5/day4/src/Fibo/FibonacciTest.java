package Fibo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    Fibonacci fibo;
    @BeforeEach
    void setUp() {
        fibo = new Fibonacci();
    }

    @Test
    void getFibonacciNumber(){
        assertEquals(2584, fibo.getFibonacciNumber(18));
    }


}