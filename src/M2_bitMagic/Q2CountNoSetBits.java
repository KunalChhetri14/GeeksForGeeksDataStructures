package M2_bitMagic;

public class Q2CountNoSetBits {

    public static void main(String args[]) {

        int n=257;
        Q2CountNoSetBits countNoSetBits = new Q2CountNoSetBits();
        System.out.println("No of set bits are:: "+ countNoSetBits.noOfSetBitsRemovingLeftMostSetBit(n));

        //using table lookup
        System.out.println("No of set bits using lookup are:: "+ countNoSetBits.countBits(n, countNoSetBits.createLookuptable()));


    }


    //Naive method
    public int noOfsetBits(int n) {
        int noOfSetBits = 0;

        while(n>0) {
            if(n%2 != 0) {
                noOfSetBits++;
            }
            n= n/2;
        }
        return noOfSetBits;
    }

    //2nd method using n&(n-1) which always removes the left most significant bit
    // Brian Kerningham's Algorithm
    public int noOfSetBitsRemovingLeftMostSetBit(int n) {
        int count = 0;
        while(n>0) {
            n=n&(n-1);
            count++;
        }
        return count;
    }

    //Loopup table solution
    //We will use already set bit to do and of (n & n-1) value in existing mapping table
    //we basically have 32 bits therefore we have done for 8 bits where the highest is 255

    public int[] createLookuptable() {
        int[] tbl= new int[256];
//        for no 0 no of set bits is 0
        tbl[0]=0;
        //from 0 to 255 we will calculate no of set bits for each no
        for(int i=1; i<256; i++) {
            tbl[i]= tbl[i&(i-1)]+1;
        }
        return tbl;
    }

    public int countBits(int n, int tbl[]) {
        //basically we will do & of number of 255 ..eg 255 & 13 is 13 therefore we have lookup table 13 value
        //Similarly if no is greater than 255 then we can divide the whole no in 32 bits and compare each bit with 255  by right shifting by
        // 8, 16 and 24 respectively
        return tbl[n&255] + tbl[(n>>8)&255] + tbl[(n>>16)&255] + tbl[(n>>24)&255];
    }

}
