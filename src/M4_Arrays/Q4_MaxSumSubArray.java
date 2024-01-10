package M4_Arrays;

class Q4_MaxSumSubArray {

    //Doesn't work for below input
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        for(int i=0; i<nums.length; i++) {
            currentSum += nums[i];
        }
        int maxSum = currentSum;
        System.out.println("...maxSum :: "+maxSum);
        int start=0, end=nums.length-1;
        while(start<end) {
            if(nums[start]<nums[end]) {
                currentSum -= nums[start];
                start++;
            } else {
                currentSum -= nums[end];
                end--;
            }
            if(currentSum > maxSum) {
                maxSum = currentSum;
            }

        }
        return maxSum;
    }


    //Optimised solution O(n)
    public static int maxSubArray3(int[] arr) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            currentSum += arr[i];
            if(currentSum > maxSum) {
                maxSum = currentSum;
            }
            if(currentSum < 0 ) {
                currentSum = 0;
            }
        }
        return maxSum;
    }

    public static int maxSum(int[] arr) {
        int maxEnding = arr[0];
        int res = arr[0];

        for (int i = 0; i < arr.length; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }

        return res;
    }

    public static int maxSubArray2(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String args[]) {
        int arr[] = {1,2,-1,-20,2,1,-2,1,4,-5,4};
        Q4_MaxSumSubArray obj = new Q4_MaxSumSubArray();
        System.out.println("The result is :: "+ maxSubArray3(arr));
    }
}
