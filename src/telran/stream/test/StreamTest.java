package telran.stream.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class StreamTest {
    int[] arr = {10,13,8,7,3,5,6};
    @Test
    @Disabled
    void arrayStreamTest() {

        int[] arr = {10, 13, 8, 7, 3, 5, 6};
        int[] empty = {};
        assertEquals(24, Arrays.stream(arr).filter(n-> n % 2 ==0).sum());
        assertEquals(0, Arrays.stream(empty).filter(n-> n % 2!=0).max().orElse(0));
        assertEquals(13, Arrays.stream(arr).filter(n-> n % 2 !=0).max().orElse(0));
    }

    @Test
    void displaySportloto(){
        Random gen = new Random();
        gen.ints(7,1,50).distinct().limit(7).forEach(n -> System.out.print(n + " "));
    }

    @Test
    void evenOddGrouping(){
        Map<String, List<Integer>> mapOddEven = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(n -> n % 2 == 0 ? "even" : "odd"));
        System.out.println(mapOddEven);
    }

    @Test
    void displayOccurrenceSorted(){
        String[] strings = {"lpm", "y", "a", "lpm", "aa", "yy", "yy", "aa", "lpm"};
        Map<String, Long> occurrenceMap = Arrays.stream(strings).collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        occurrenceMap.entrySet().stream()
                .sorted((e1,e2) -> {
                int res = Long.compare(e2.getValue(), e1.getValue());
                if (res == 0){
                    res = e1.getKey().compareTo(e2.getKey());
                }
                return res;

        }).forEach(e -> System.out.printf("%s => %d\n", e.getKey(), e.getValue()));

    }

    @Test
    void stringStream(){
        String string = "Hello";
        //output: h,e,l,l,o
        //string.chars().forEach(c -> System.out.print(c + ","));
        string.chars().mapToObj(c -> "" + (char)c).forEach(s -> System.out.println(s + ","));
    }

    @Test
    void splittingStringArray(){
        String [] strings = {"Hello", "world"};
        //output: H,e,l,l,o,w,o,r,l,d
        Arrays.stream(strings).flatMapToInt(str -> str.chars())
                .mapToObj(c -> "" + (char)c).forEach(s -> System.out.print(s + ","));;
    }


}