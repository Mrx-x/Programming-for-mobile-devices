package ru.sdobnikov.lab_1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void max_test_1() {
        assertEquals(1, MyClass.max(1));
    }
    @Test
    public void max_test_2() {
        assertEquals(5, MyClass.max(1, 5));
    }
    @Test
    public void max_test_3() {
        assertEquals(10, MyClass.max(5, 10, -10));
    }
    @Test
    public void max_test_4() {
        assertEquals(373, MyClass.max(2, 23, 66, 1, 66, 48, 373, 3));
    }
    @Test
    public void max_test_5() {
        assertEquals(-10, MyClass.max(-50, -20, -10, -99));
    }
    @Test
    public void min_test_1() {
        assertEquals(5, MyClass.min(5));
    }
    @Test
    public void min_test_2() {
        assertEquals(0, MyClass.min(5, 0));
    }
    @Test
    public void min_test_3() {
        assertEquals(1, MyClass.min(3, 152, 1));
    }
    @Test
    public void min_test_4() {
        assertEquals(1, MyClass.min(2, 23, 66, 1, 66, 48, 373, 3));
    }
    @Test
    public void min_test_5() {
        assertEquals(-199, MyClass.min(-50, -20, -10, -199));
    }
}