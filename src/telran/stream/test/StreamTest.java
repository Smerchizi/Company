package telran.stream.test;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StreamTest {
    @Test
    void arrayStreamTest() {

        int[] arr = {10, 13, 8, 7, 3, 6, 6};
        assertEquals(24, Arrays.stream(arr).filter(n-> n%2 ==0).sum());
        assertEquals(0, Arrays.stream(empty).filter(n-> n % 2 ==0).max().orElse(0));
        assertEquals(13, Arrays.stream(arr).filter(n-> n % 2 ==0).max().orElse(0));
    }


}