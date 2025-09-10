package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FailTest {

    @Test
    void testFailure() {
        fail("このテストは意図的に失敗します");
    }
}
