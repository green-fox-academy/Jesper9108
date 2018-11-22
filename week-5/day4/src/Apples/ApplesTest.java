package Apples;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ApplesTest {

    Apples randomapple;

    @BeforeEach
    void setUp() {
        randomapple = new Apples();
    }

    @Test
    void getApples() {

        org.junit.jupiter.api.Assertions.assertEquals("apple", randomapple.getApples());

    }
}