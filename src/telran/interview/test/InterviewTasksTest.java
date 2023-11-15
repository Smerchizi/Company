package telran.interview.test;

import static org.junit.jupiter.api.Assertions.*;
import static telran.interview.InterviewTasks.*;

import java.util.HashMap;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InterviewTasksTest {
	private static final int N_NUMBERS = 100000;
	int[] bigArray = new int[N_NUMBERS];
	@Test
	@DisplayName("performance O[N] is Sum2 ")
	void isSum2PerformanceTest() {
		//isSum2 complexity O[N]
		isSum2(bigArray, 1);
	}
	@Test
	@Disabled
	@DisplayName("performance O[N^2] is Sum2N2 ")
	void isSum2N2PerformanceTest() {
		//isSum2N2 complexity O[N^2]
		isSum2N2(bigArray, 1);
	}
	@Test
	@Disabled
	void isSum2Test() {
		int [] ar1 = {1000, 300, -200, 20, 40, -10};
		assertTrue(isSum2(ar1, 800));//1000 + (-200) = 800
		assertTrue(isSum2(ar1, 990));//1000 + (-10) = 990
		assertFalse(isSum2(ar1, 50)); //no two number with the given sum
	}
	@Test
	@Disabled
	void isSum2N2Test() {
		int [] ar1 = {1000, 300, -200, 20, 40, -10};
		assertTrue(isSum2N2(ar1, 800));//1000 + (-200) = 800
		assertTrue(isSum2N2(ar1, 990));//1000 + (-10) = 990
		assertFalse(isSum2N2(ar1, 50)); //no two number with the given sum
	}
	@Test
	@Disabled
	void getMaxPositiveWithNegativeValueTest() {
		int [] ar1 = {-1,100, 200, -50, 1, -100, 50};
		int [] ar2 = {-1, -100, 200, -500, 10, -100, 50, 200};
		assertEquals(100, getMaxPositiveWithNegativeValue(ar1));
		assertEquals(-1,  getMaxPositiveWithNegativeValue(ar2));
	}
	@Test
	@Disabled
	void getMapOccurrencesTest() {
		String[] strings = {
				"lpm", "ab", "a", "lpm", "a", "aa", "lpm"
		};
		HashMap<String, Long> mapOccurrences = getMapOccurrences(strings);
		assertEquals(3, mapOccurrences.get("lpm"));
		assertEquals(2, mapOccurrences.get("a"));
		assertEquals(1, mapOccurrences.get("ab"));
		assertEquals(1, mapOccurrences.get("aa"));
	}
	@Test
	@Disabled
	void isAnagramTest() {
		String string = "yellow";
		assertTrue(isAnagram(string, "wolely"));
		assertTrue(isAnagram(string, "elolwy"));
		assertTrue(isAnagram(string, "lowely"));
		assertTrue(isAnagram(string, "ollwey"));
		assertFalse(isAnagram(string, "wolelw")); //not y
		assertFalse(isAnagram(string, string));//the same order
		assertFalse(isAnagram(string, "wglely"));//g is not from the string
		assertFalse(isAnagram(string, "wolye"));//must be two 'l'

	}
	@Test
	void displayDigitsDistributionTest() {
		displayDigitsDistribution();
		//required output
		/* always 1 will be first
		 *        2 will be second
		 * 1 - <counter of occurrences>
		 * 2 -  <counter of occurrences>
		 * random order of digits
		 * 0 - <counter of occurrences>
		 * 4 - <counter of occurrences>
		 * 3 - <counter of occurrences>
		 * 5 - <counter of occurrences>
		 * 7 - <counter of occurrences>
		 * 6 - <counter of occurrences>
		 * 9 - <counter of occurrences>
		 * 8 - <counter of occurrences>
		 */
	}

	@Test
	void displayArrayShufflingTest(){
		int[] array = {1,2,3,4,5,6};
		for (int i = 0; i < 3; i++){
			displayArrayShuffling(array);
		}
	}


}