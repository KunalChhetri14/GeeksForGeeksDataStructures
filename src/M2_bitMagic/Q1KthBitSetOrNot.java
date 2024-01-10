package M2_bitMagic;

public class Q1KthBitSetOrNot {
    public static void main(String args[]) {

//        Let say no is 5 i.e 101 therfore 1st and 3rd bit is set to true
//        Given n find kth bit is set or not
//        if 101 then to find k=3 we will simply find value of 2k-2  i.e 101 && 100 will give us kth bit value

        int n=8, k=3;
        int x=1;
        for(int i=1; i<=k; i++) {
            x=x*2;
        }
        boolean isSet = ((x&n) == 0) ? false : true;
        System.out.println("The result is "+ isSet);
    }
}
