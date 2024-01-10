package Java8.StreamsAPI;

import java.util.Arrays;
import java.util.List;

public class FindingElementsUsingStream {


    public static void main(String args[]) {

        List<Integer> ls = Arrays.asList(5,3,6,2,7);
        //find first and findany
        Integer first = ls.stream().findFirst().get();
        System.out.println("result:: "+first);
    }
}
