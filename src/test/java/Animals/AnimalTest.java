package Animals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    private Animal animal;

    @BeforeEach
    void setUp() {
        animal = new Animal("Ugly Duckling", Gender.Male);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void TestConstructorNameAreEqual(){
        //Arrange
        //Act
        //Assert
        assertEquals("Ugly Duckling", this.animal.Name);
    }

    @Test
    void TestConstructorGenderAreEqual(){
        //Arrange
        //Act
        //Assert
        assertEquals(Gender.Male, this.animal.Gender);
    }

    @Test
    void TestConstructorReservedIsNull(){
        //Arrange
        //Act
        //Assert
        assertNull(this.animal.reservedBy);
    }

}