package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void helloShouldReturnMessage() {
        assertEquals("Hello, Maven!", App.hello());
    }
}
