package M2_bitMagic;

public class BitPropertiesOnSet {

    public static void main(String args[]) {

        int n[]= {23, 45,23, 45, 11};

        System.out.println("Xor is :: "+findXor(n));




    }

    public static int  findXor(int ar[]) {
        int xor=0;
        for(int i=0; i<ar.length; i++) {
            xor = xor ^ ar[i];
        }
        return xor;
    }
}
