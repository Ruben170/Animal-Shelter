package Animals;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DogTest {

    private static Dog dog;
    private static Dog dog2;

    @BeforeAll
    static void setUp() {
        dog = new Dog("Lilo", Gender.Female);
        dog2 = new Dog("Clifford", Gender.Male);

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


    //Method tests

    @Test
    void getPriceFirstDog() {
        assertEquals(500, dog.getPrice());
    }

    @Test
    void getPriceSecondDog() {
        assertEquals(450, dog2.getPrice());
    }
}