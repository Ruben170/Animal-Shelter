package Animals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CatTest {

    private Cat cat;


    @BeforeEach
    void setUp() {
        cat = new Cat("Whiskers", Gender.Female, "Scratching");
    }

    @AfterEach
    void tearDown() {
    }

    //Constructor tests

    @Test
    void TestNameEqual(){
        assertEquals("Whiskers", cat.Name);
    }

    @Test
    void TestGenderEqual(){
        assertEquals(Gender.Female, cat.Gender);
    }

    @Test
    void TestbadHabitsEqual(){
        assertEquals("Scratching", cat.getBadHabits());
    }

    //Method tests


}