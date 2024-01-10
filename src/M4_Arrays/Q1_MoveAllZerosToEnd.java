package M4_Arrays;

public class Q1_MoveAllZerosToEnd {

    public static void main(String args[]) {
        int arr[] = {8, 5, 0, 10, 0, 0, 20};
//        arr = moveZeroes(arr);
        arr= movesZeroesEfficient(arr);


    }

    public static int[] movesZeroesEfficient(int arr[]) {
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]!=0) {
                int temp = arr[count];
                arr[count]=arr[i];
                arr[i]=temp;
                count++;
            }
        }
        return arr;
    }

    public static int[] moveZeroes(int arr[]) {

        int current=0;
        if(arr.length == 0 || arr.length == 1) {
            return arr;
        }

        for(int i=0; i<arr.length; i++) {
            if(arr[i]!=0) {
                arr[current]= arr[i];
                current++;
            }
        }
        for(int j=current; j<arr.length; j++) {
            arr[j] = 0;
        }
        return arr;
    }
}
