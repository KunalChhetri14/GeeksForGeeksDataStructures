package Java8.StreamsAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamFilter {

    public static List<Integer> findLength(List<String> str) {

        List<Integer> ls = str.stream().map(i -> i.length()).collect(Collectors.toList());
        return ls;
    }

    public static String printUniqueElement(List<String> str) {

        List<String> ls = str.stream().map(s -> s.split("")).flatMap(Arrays:: stream).distinct().collect(Collectors.toList());
        return "Hello";
    }
    public static Integer findGreatestNo(List<Integer> arr) {

        Integer greatestNo = arr.stream().mapToInt(a -> a).max().orElseThrow(NoSuchElementException:: new);
        return greatestNo;
    }

    public static Integer smallestNo(List<Integer> arr) {
        Integer smallestNo = arr.stream().mapToInt(i -> i).min().orElseThrow(NoSuchElementException:: new);
        return smallestNo;
    }

    public static List<Integer> reverseArray(List<Integer> arr) {
        Collections.reverse(arr);
        return arr;
    }


    public static void main(String args[]) {
        int arr[] = {23, 56, 27, 87, 20};
        long arr11[] = {23, 56, 27, 87, 20};
        long a = 20;
        int b = 24;

//        List<Long> arr2 = LongStream.of(arr11).boxed().collect(Collectors.toList());
        List<Integer> arr1 = IntStream.of(arr).boxed().collect(Collectors.toList());
//        List<Integer> arrList = Arrays.asList(arr).stream().mapToInt(i -> IntStream.of(i)).collect(Collectors.toList());
//        arr1 = arr1.stream().filter(i -> i%2 == 0).map(m -> m*10).collect(Collectors.toList());
//        System.out.println(arr1);
        int max = findGreatestNo(arr1);
        int min =smallestNo(arr1);
        String[] str3 = {"Stack", "Overflow"};
        List<String> strss = Arrays.asList(str3);
        printUniqueElement(strss);
        reverseArray(arr1);
        System.out.println("heello");
    }



}
