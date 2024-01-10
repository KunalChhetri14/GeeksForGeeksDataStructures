package M4_Arrays;

import java.util.Arrays;

public class Q5_MaxCircularSubArray {

    //find the normal maxSumArray
    //find the circular maxSubArray -> find the min subArray and subtract from the total sum of array
    //Max of both
    public static void main(String args[]) {
        int arr[] = {-1, 40, -14, 7, 6, 5, -4, -1};
        int minSubArray = findMinimumSubArray(arr);
        int total = Arrays.stream(arr).sum();
        int maxSum = findMaxSumSubArray(arr);
        int circularSum = total - minSubArray;
        int result = Math.max(maxSum, circularSum);

    }


    public static int findSumArray(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum+= arr[i];
        }
        return sum;
    }
    public static  int findMaxSumSubArray(int[] arr) {
        int currentSum=0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            currentSum += arr[i];
            if(currentSum>maxSum) {
               maxSum = currentSum;
            }
            if(currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }

    public static int findMinimumSubArray(int[] arr) {
        int res = 0;
        int finalMin = 0;
        int currentMin = arr[0];

        for(int i=0; i<arr.length; i++) {
            currentMin += arr[i];
            if(currentMin>0) {
                currentMin = 0;
            }
            if(currentMin < finalMin) {
               finalMin = currentMin;
            }
        }
        return finalMin;
    }

}
