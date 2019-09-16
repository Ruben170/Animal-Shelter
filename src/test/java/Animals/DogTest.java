package Animals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    private Dog dog;

    @BeforeEach
    void setUp() {
        dog = new Dog("Lilo", Gender.Female);
    }

    @AfterEach
    void tearDown() {
    }

    //Constructor tests

    @Test
    void TestNameEqual(){
        assertEquals("Lilo", dog.Name);
    }

    @Test
    void TestGenderEqual(){
        assertEquals(Gender.Female, dog.Gender);
    }
}