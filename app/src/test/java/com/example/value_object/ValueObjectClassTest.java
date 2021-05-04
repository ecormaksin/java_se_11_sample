package com.example.value_object;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ValueObjectClassTest {

    @Test
    void checkNull() throws Exception {

        assertThrows(NullPointerException.class, () -> {
            new ValueObjectClass(null);
        });
    }
}
