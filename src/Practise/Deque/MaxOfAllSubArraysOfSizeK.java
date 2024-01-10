package Practise.Deque;


//find max of all subarray of size k
//10, 8, 5, 12, 15, 7 , 6



// forloop till k-1 and check last last element
// 0
// peekLast
// 0 1
// 0 1 2


// for k to length-1
// check first element is out of index or isSmaller than currentNo and pop
// 1 2   2  empty
//Insert latest Index  4
// for 15 -> 4 is not out of index ...

// result : 10 , 12, 15, 15, 15

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MaxOfAllSubArraysOfSizeK {

    public List<Integer> fetchMaxOfSubArray(List<Integer> ls, int k) {

        Deque<Integer> deque = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        int index = 0;
        int max=ls.get(0);
        for(int i=0; i<k; i++) {

            while(!deque.isEmpty() && ls.get(deque.getLast())<=ls.get(i)) {
                deque.pop();
            }
            deque.add(i);
        }

        for(int i=k; i<ls.size(); i++) {
            System.out.println("Max:: "+ deque.getFirst());
            result.add(ls.get(deque.getFirst()));
            while(!deque.isEmpty() && deque.getFirst() <= i-k) {
                deque.pop();
            }

            while(!deque.isEmpty() && ls.get(deque.getLast())<= ls.get(i)) {
                deque.pop();
            }
            deque.add(i);
        }

        return result;
    }

    public static void main(String args[]) {

        int arr[] = {10, 8, 5, 12, 15, 7 , 6};
        List<Integer> ls = IntStream.of(arr).boxed().collect(Collectors.toList());
//                Arrays.asList(arr).stream().
        MaxOfAllSubArraysOfSizeK maxOfAllSubArraysOfSizeK = new MaxOfAllSubArraysOfSizeK();
        List<Integer> output = maxOfAllSubArraysOfSizeK.fetchMaxOfSubArray(ls, 3);

    }
}
