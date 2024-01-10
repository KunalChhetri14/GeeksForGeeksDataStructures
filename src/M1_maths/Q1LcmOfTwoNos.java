package M1_maths;

public class Q1LcmOfTwoNos {

    public static void main(String args[]) {
        int a=84, b=64;
        System.out.println("HCf is:: "+new Q1LcmOfTwoNos().findHcfByRem(a, b));
    }

    public int findHcfBySub(int a, int b) {
        // lets assume there are two nos a and b
        // We know at any time a*b = ab
        //Lets assume a is small therefore eculeudein algo says that hcf of (b-a, a) will be same as hcf(a,b)
        //eg: 64 and 84  hcf is 4 and 20 and 64 hcf is also 4
        int result = 0;
        while(a != b) {
            if(a>b) {
                a=a-b;
                result = a;
            } else {
                b=b-a;
                result = b;
            }

        }
        return result;
    }

    public int findHcfByRem(int a, int b) {
        if(b==0) {
            return a;
        }
        return findHcfByRem(b, a%b);
    }

}
