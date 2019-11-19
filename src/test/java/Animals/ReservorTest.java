package Animals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;

import static org.junit.jupiter.api.Assertions.*;

class ReservorTest {


    private Reservor reservor;

    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    @BeforeEach
    void setUp() {
        reservor = new Reservor("Ruben", timestamp);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getName() {
        assertEquals("Ruben", reservor.Name);
    }

    @Test
    void getReservedAt() {
        assertEquals(timestamp, reservor.ReservedAt);
    }
}