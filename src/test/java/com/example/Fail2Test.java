package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FailTest {

    @Test
    void thisWillFail() {
        int result = 2 + 2;
        // わざと間違えた期待値
        assertEquals(4, result, "2+2 should NOT equal 4");
    }
}
