package CountL;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTest {
    CountLetters example;

    @BeforeEach
    void setUp() {
        example = new CountLetters();
    }

    @Test
    void letterCounter() {
        HashMap<Character, Integer> mapExample = new HashMap<>();
        mapExample.put('v',1);
        mapExample.put('a',2);
        mapExample.put('l',1);
        mapExample.put('m',1);
        mapExample.put('i',1);

        assertEquals(mapExample, example.letterCounter("vaalmi"));
    }
}