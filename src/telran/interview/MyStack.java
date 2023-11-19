package telran.interview;

import java.util.LinkedList;

/**
 * All the method implementations should be in the complexity O[1]
 */
public class MyStack {
    private LinkedList<Integer> numbers = new LinkedList<>();
    private LinkedList<Integer> maxNumbers = new LinkedList<>();
    /**
     * adds a given number at top of the stack
     * @param number
     */
    public void push(int number) {
        numbers.add(number);
        if (maxNumbers.isEmpty() || number >= maxNumbers.getLast()) {
            maxNumbers.add(number);
        }
    }
    /**
     *
     * @return number and remove the number form the stack top
     * In the case the stack is empty the Exception (NoSuchElementException)
     * must be thrown
     */
    public int pull() {
        int res = numbers.removeLast();
        if (res == maxNumbers.getLast()) {
            maxNumbers.removeLast();
        }
        return res;
    }
    /**
     *
     * @return true if the stack is empty otherwise false
     */
    public boolean isEmpty() {

        return numbers.isEmpty();
    }
    /**
     *
     * @return maximal number existing in the stack
     * In the case the stack is empty the Exception (NoSuchElementException)
     * must be thrown
     */
    public int getMax() {
        return maxNumbers.getLast();
    }
}