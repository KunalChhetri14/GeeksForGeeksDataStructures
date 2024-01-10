package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiJava {


    public static void main(String args[]) {


        List<String> list = Arrays.asList("abac1", "kabc2", "habc3");
        Stream<String> size = list.stream().skip(1)
                .map(element -> element.substring(0, 3)).sorted();
        System.out.println("The size :: "+size);


        List<Integer> list1 = Arrays.asList(1,2,4,5,5);
        Integer result  = list1.stream().reduce(0, Integer::sum);
    }
}
