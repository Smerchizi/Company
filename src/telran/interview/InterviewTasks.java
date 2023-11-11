package telran.interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class InterviewTasks {

/**
 * 
 * @param ar array of integer numbers
 * @param sum integer number
 * @return true if the given array contains two numbers, the sum of which equals the given sum value
 */
	public static boolean isSum2(int [] ar, int sum) {
		HashSet<Integer> seenNumbers = new HashSet<>();
		for (int num : ar) {
			int complement = sum - num;

			if (seenNumbers.contains(complement)) {
				return true;
			}

			seenNumbers.add(num);
		}

		return false;
	}

	/**
	 * 
	 * @param ar array of integer numbers
	 * @return maximal positive number having negative number with the same absolute value
	 */
	public static int getMaxPositiveWithNegativeValue (int ar[]) {
		int pos = Integer.MIN_VALUE;
		int testNum = 0;
		HashSet<Integer> seenNumbers = new HashSet<>();
		for (int num : ar) {
			testNum = num * -1;
			if (seenNumbers.contains(testNum) && testNum > pos ) {
				pos = testNum;
			}
			if (num < 0 && num > pos){
				pos = num;

			}
			seenNumbers.add(num);
		}

		return pos;
	}
	
	/**
	 * 
	 * @param strings - array of strings
	 * @return Map where key - string, value - number of occurrences in the array
	 */
	public static HashMap<String, Long> getMapOccurrences(String[] strings) {
		HashMap<String, Long> map = new HashMap<>();
		for (String s : strings) {
			boolean res = map.containsKey(s);
			if (res == false) {
				map.put(s, 1L);
			} else {
				Long value = map.get(s);
				value++;
				map.replace(s, value);
			}

		}

		return map;
	}


}
