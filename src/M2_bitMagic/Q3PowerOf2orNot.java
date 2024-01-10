package M2_bitMagic;

public class Q3PowerOf2orNot {

    public static void main(String args[]) {

        int no=128;

        Q3PowerOf2orNot obj = new Q3PowerOf2orNot();
        System.out.println(obj.isPowerOrNotUsingKerninghamsAlgo(no));

    }

    public boolean isPowerOrNot(int n) {

       boolean isBoolean = true;

       while(n!=1) {
           if(n%2!=0) {
               isBoolean = false;
               break;
           }
           n=n/2;
       }
       return isBoolean;

    }

    // Uinsg Brian Kerningham's Algorithm which is used to find the rightmost bit where
    // We will check that only one of the bit is set if yes then it is power of 2 else no
    public boolean isPowerOrNotUsingKerninghamsAlgo(int n) {
        boolean isPower = false;
        int isSetValue = 0;

        while(n>0) {
            n=n&(n-1);
            if(n>0) {
                isSetValue++;
            }
            if(isSetValue>1) {
                break;
            }
        }
        if(isSetValue>1) {
            return false;
        } else {
            return true;
        }

    }

}
