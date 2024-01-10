package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@FunctionalInterface
interface Inf {
    public void sum(int a, int b);

    public default int sub(int a, int b) {
        return a-b;
    }
}

public class MethodReferences {



    public static void main(String args[]) {
        String [] arr = {"Kunal", "Khal", "Omakra", "Aakar"};
        int[] no = {1,2,43,4,5};
//        List<Integer> ls = Arrays.asList(no).stream().map(i-> con(i)).collect(Collectors.toList());
        List<String> l1 = new ArrayList<>();
        Collections.addAll(l1, arr);
//        List l2= (ArrayList<String>) Arrays.asList(arr);
        System.out.println("The output is:: "+l1);
//        l1 = l1.stream().map(i-> convert(i)).collect(Collectors.toList());
//        l1 = l1.stream().map(new MethodReferences()::convert).collect(Collectors.toList());
        l1 = l1.stream().map(MethodReferences:: convert).collect(Collectors.toList());
        Arrays.sort(arr, (i, j) -> i.compareTo(j));
        Inf inf = (int a, int b) -> {
            System.out.println(a + b);
        };


        System.out.println("Cools");
        Function<Integer, String> fn = (no1) -> no1%2 == 0 ? "even" : "odd";
        System.out.println(fn.apply(10));
    }

    public static Integer con(int i) {
        return (Integer) i;
    }

    public static String convert(String str) {
        return str + "Kunal";
//        return "Cool";
    }
}
