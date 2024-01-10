package M4_Arrays;

public class Q6_MajorityELement {

    public static void main(String args[]) {
        int arr[] = {2,2,1,1,1,2,2};
        int result = majorityElement(arr);
        System.out.println(result);
    }


    // O(n2) -> two for loops
    // O(nlogn) -> sorting

    //Efficient O(n)
    public static int majorityElement(int[] nums) {

        int result = 0;

        int currentMax = nums[0];
        int count = 1;

        for(int i=1; i<nums.length; i++) {
            if(nums[i] == currentMax) {
                count++;
            } else {
                count--;
            }
            if(count == 0) {
                currentMax=nums[i];
                count = 1;
            }
        }

        //Checking no of times curent max is present
        //loop through and check


        return currentMax;
    }

}
