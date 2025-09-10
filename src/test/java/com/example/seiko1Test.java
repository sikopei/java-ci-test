package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class seiko1Test {

    @Test
    void testAddition() {
        // このテストは必ず成功します
        assertEquals(2, 1 + 1, "1 + 1 は 2 であるべき");
    }

    @Test
    void testString() {
        // 文字列の一致確認
        String message = "hello";
        assertEquals("hello", message);
    }
}
