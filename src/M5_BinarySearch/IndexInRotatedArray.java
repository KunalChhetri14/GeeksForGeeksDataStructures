package M5_BinarySearch;

public class IndexInRotatedArray {

    public static void main(String args[]) {
        int arr[] = {4,5,6,7,0,1,2};
        int result = search(arr, 0);
        System.out.println("INdex is :: "+result);
    }

    public static int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;
        int result = -1;

        while(start<=end) {

            int mid = (start+end)/2;
            int element = nums[mid];

            if(element == target) {
                result = mid;
                break;
            }

            if(nums[start]<=nums[mid]) {
                if(target<nums[mid] && target>=nums[start]) {
                    end=mid-1;
                } else {
                    start=mid+1;
                }
            } else {
                if(target>nums[mid] && target<= nums[end]) {
                    start=mid+1;
                } else {
                    end=mid-1;
                }
            }

        }

        return result;


    }

}
