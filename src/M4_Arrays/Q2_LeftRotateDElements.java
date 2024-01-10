package M4_Arrays;

public class Q2_LeftRotateDElements {

    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5};
        arr = leftRotate(arr, 3);

    }

    //Naive approach
//    Same as leftRotate by 1
//    Store 1st index and traverser from 0 to n-2
//    Update current index with next index

    //2nd approach
    //Store first d elements in temp array
    //Traverse from d to last index and store in arr
    //Traverse from length-d to last index and store temp content

    //efficient approach
    public static int[] leftRotate(int arr[], int d) {
        arr= reverse(arr, 0, d-1); //reverse first d elements
        arr= reverse(arr, d, arr.length-1); //reverse remaining elements
        arr = reverse(arr, 0, arr.length-1); //reverse from start to finish
        return arr;
    }

    public static int[] reverse(int arr[], int left, int right) {
        while(left < right) {
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }

}
