package com.example;

import com.google.common.base.Joiner;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

class GuavaTest {

    @Test
    void joinStringsWithGuava() {
        String result = Joiner.on(", ").join(Arrays.asList("apple", "banana", "cherry"));
        assertEquals("apple, banana, cherry", result);
    }
}
