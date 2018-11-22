package Farm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    Animal sampleAnimal;

    @BeforeEach
    void setUp() {
        sampleAnimal = new Animal();
    }

    @Test
    void animalHunger() {
        assertEquals(50, sampleAnimal.getHunger());
    }

    @Test
    void animalThirst() {
        assertEquals(50, sampleAnimal.getThirst());
    }

    @Test
    void eat() {
        assertEquals(49, sampleAnimal.eat());
    }

    @Test
    void drink() {
        assertEquals(49, sampleAnimal.drink());
    }

    @Test
    void play() {
        sampleAnimal.play();
        assertEquals(51, sampleAnimal.getHunger());
        assertEquals(51, sampleAnimal.getThirst());
    }
}