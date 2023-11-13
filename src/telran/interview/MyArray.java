package telran.interview;

import java.util.HashMap;

/**
 * All methods of the class should have complexity O[1]
 * @author User
 *
 * @param <T>
 */
public class MyArray {
    private int size;
    private int allValues;
    private HashMap<Integer, Integer> valuesMap = new HashMap<>();
    /********************************************/
    /**
     * constructor
     * @param size - length of the array
     */
    public MyArray(int size) {
        this.size= size;
    }
    /**
     * sets all array's elements with a given value
     * @param value
     */
    public void setAll(int value) {

        valuesMap = new HashMap<>();
        allValues = value;
    }
    /**
     *
     * @param index
     * @return value at given index or null if index is wrong
     */
    public Integer get(int index) {
        Integer res = null;
        if (index >= 0 && index < size) {
            res = valuesMap.getOrDefault(index, allValues);
        }
        return res;
    }
    /**
     * sets a given value at a given index
     * throws IndexOutOfBoundsException in the case of wrong index
     * @param index
     * @param value
     */
    public void set(int index, int value) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }
        valuesMap.put(index, value);
    }
}