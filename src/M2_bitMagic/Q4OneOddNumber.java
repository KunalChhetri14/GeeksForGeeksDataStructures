package M2_bitMagic;

public class Q4OneOddNumber {

    public static void main(String args[]) {

        int n[]= {23, 45,23, 45, 22};

        System.out.println("Xor is :: "+findXor(n));

    }

    //Navie approcah is checking ocuurence of each number i.e O(n2)
    //Other approach is using hashtable

    //Third apporach is uing xor
    // We know in XOR it is 1 only if both numbers are different
    // Therefore if only one number is repeated odd times then if any no lets  say 45 45 45 45 is Xor'ed then it will be 0 as it will cancel out
    // if 45 45 11 then xor will be 11 as 45 and 45 will cancel out


    public static int  findXor(int ar[]) {
        int xor=0;
        for(int i=0; i<ar.length; i++) {
            xor = xor ^ ar[i];
        }
        return xor;
    }
}
