package Sum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
    Sum example;
    ArrayList<Integer> testList = new ArrayList<>();

    @BeforeEach
    void setUp() {
        example = new Sum();
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(14);
    }

    @Test
    void sumOfElements() {
        assertEquals(20, example.sumOfElements(testList));
    }
}