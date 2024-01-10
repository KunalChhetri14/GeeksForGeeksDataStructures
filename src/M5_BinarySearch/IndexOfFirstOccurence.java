package M5_BinarySearch;

public class IndexOfFirstOccurence {

    public static void main(String args[]) {

        int nums[] = {5,7,7,1,8,8,10};
        int target = 8;

        int start = 0;
        int end = nums.length-1;
        int result = -1;


        while(start<=end) {
            int mid = (start+end)/2;
            int no = nums[mid];

            if(target == no) {
                if(mid == 0 || nums[mid-1]!= target) {
                    result = mid;
                    break;
                } else {
                    end=mid-1;
                }


            } else if(no < target) {
                start=mid+1;
            } else {
                end=mid-1;
            }
        }
        System.out.println("The reslt is:: "+result);
    }

}
