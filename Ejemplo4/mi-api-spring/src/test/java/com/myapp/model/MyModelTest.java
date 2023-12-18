
package com.myapp.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyModelTest {

    @Test
    public void testIsPrime() {
        assertFalse(MyModel.isPrime(0));
        assertFalse(MyModel.isPrime(1));
        assertTrue(MyModel.isPrime(2));
        assertFalse(MyModel.isPrime(4));
        assertTrue(MyModel.isPrime(5));
        assertFalse(MyModel.isPrime(10));
        assertTrue(MyModel.isPrime(13));
    }
}