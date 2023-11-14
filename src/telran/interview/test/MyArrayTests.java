package telran.interview.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import telran.interview.MyArray;

class MyArrayTests {

    private static final int LENGTH = 1000;
    private static final int VALUE = 10;
    private static final int OTHER_VALUE = 5;
    MyArray array;
    @BeforeEach
    void setUp() throws Exception {
        array = new MyArray(LENGTH);
        array.setAll(VALUE);
    }

    @Test
    void testSetAll() {
        //all numbers should be equaled to VALUE
        for (int i = 0; i < LENGTH; i++) {
            assertEquals(VALUE, array.get(i));
        }
    }

    @Test
    void testSetGet() {
        array.set(0, OTHER_VALUE);
        array.set(LENGTH - 1, OTHER_VALUE);
        int limit = LENGTH - 1;
        //value at index 0 and value at index LENGTH-1 should be equaled to OTHER_VALUE
        //others - VALUE
        for(int i = 1; i < limit; i++) {
            assertEquals(VALUE, array.get(i));
        }
        assertEquals(OTHER_VALUE, array.get(0));
        assertEquals(OTHER_VALUE, array.get(limit));
        array.setAll(OTHER_VALUE);
        //all numbers equaled to OTHER_VALUE
        for(int i = 0; i < LENGTH; i++) {
            assertEquals(OTHER_VALUE, array.get(i));
        }

    }
    @Test
    void testGetWrongIndex() {
        assertNull(array.get(LENGTH));
    }
    @Test
    void testSetWrongIndex() {
        assertThrowsExactly(IndexOutOfBoundsException.class, ()->array.set(-1, OTHER_VALUE));
    }

}