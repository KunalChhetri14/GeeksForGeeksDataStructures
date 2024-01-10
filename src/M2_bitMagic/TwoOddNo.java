package M2_bitMagic;

public class TwoOddNo {

    public static void main(String args[]) {

        int arr[]= {3,4,3,4,5,4,4,6, 7,7};
        int value = findXor(arr);  //if arr == 0 then no odd value, if arr >0 and contains in arr then 1 else > 1
        boolean contains = true;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == value) {
                contains = false;
                break;
            }
        }
        System.out.println("Two odd is contained :: "+ contains);
    }

    public static int findXor(int arr[]) {
        int xor=0;
        for(int i=0; i<arr.length; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }
}
