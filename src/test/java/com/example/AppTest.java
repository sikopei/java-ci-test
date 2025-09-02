package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void sampleTest() {
        int sum = 2 + 3;
        assertEquals(5, sum, "2+3 should equal 5");
    }
}
