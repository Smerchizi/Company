package telran.interview.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import telran.interview.MyDictionary;


class MyDictionaryTest {
    String[] words = {"ace", "acne", "accept", "apple", "appeal", "approach"};
    MyDictionary dictionary;
    @BeforeEach
    void setUp() {
        dictionary = new MyDictionary(Arrays.asList(words));

    }
    @Test
    void addWordTest() {
        assertTrue(dictionary.addWord("arka"));
        assertFalse(dictionary.addWord("arka"));
    }
    @Test
    void getWordsByPreffixTest() {
        //Put attention that expected and actual arrays are the sorted ones
        //with no sorting in the test. Consider it as a hint
        String [] expected_ac = {"accept", "ace", "acne"};
        String [] expected_app = {"appeal", "apple", "approach"};
        assertArrayEquals(expected_ac, dictionary.getWordsByPrefix("ac"));
        assertArrayEquals(expected_app, dictionary.getWordsByPrefix("app"));

    }

}