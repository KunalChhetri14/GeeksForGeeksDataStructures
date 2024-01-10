package M2_bitMagic;

public class Q5TwoOddNo {

    public static void main(String args[]) {

        int arr[] = {4,2,4,5,2, 3, 3, 1};

        //fnd xor of all values here we will get reslt which is again  xor of the two odd nos i.e a^b = result (a and b is the reqd value)
        int result = findXorAll(arr);

//        Now we know that the last(kth) value becomes 1 when either a has 1 or b has 0 Or a has 0 or b has 1.
//        anyways we know that one should have kth value as set and another should have kth value as unset
//            int k = findMostRightSetValue(result); //1st method

//            2nd method to find the power of the rightmost set bit
//            no & (~(n-1)) //gives the positoin ex: for 4 , n-1 is 3 ie 11 -> ~(n-1) = ....1111100 => now 100 & ....1111100 gives 100
            int k = result & (~(result-1));
            int setBit = 0;
            int unsetBit = 0;
            for(int i=0; i<arr.length; i++) {
                if((arr[i] & k) == 0) {
                    unsetBit = unsetBit ^ arr[i];
                } else {
                    setBit = setBit^arr[i];
                }
            }

            System.out.println("The two bits are :: "+ setBit + "  and "+unsetBit);



    }

    public static int findMostRightSetValue(int n) {
        int power = 1;
        int i=0;
        while(n%2!=1) {
            i++;
            n=n/2;
        }
        //return the no;
        return (int)Math.pow(2,i);
    }

    public static int findXorAll(int arr[]) {
        int result=0;
        for(int i=0; i<arr.length; i++) {
            result = result ^ arr[i];
        }
        return result;
    }
}
