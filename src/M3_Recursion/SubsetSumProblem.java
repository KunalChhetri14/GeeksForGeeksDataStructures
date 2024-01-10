package M3_Recursion;

public class SubsetSumProblem {

    public static void main(String args[]) {
            int arr[] = {10, 20, 15};

            int result = noSubsetEqualToSum(arr, 0, 0, 0);
            System.out.println(result);
    }

    public static int noSubsetEqualToSum(int[] no, int currentSum, int index, int target) {

        if(index == no.length) {
            if(currentSum == target) {
                return 1;
            } else {
                return 0;
            }
        }

        int x = noSubsetEqualToSum(no, currentSum, index+1, target);
        int y = noSubsetEqualToSum(no, currentSum + no[index], index+1, target);
        return x+y;
    }
}
