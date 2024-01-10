package M3_Recursion;

//Given length and size to be cut find max no of cuts we can make to get exactly size of rope
//23 , a=11, b =12 , c=9
public class Q3_RopeCuttingProblem {

    public static void main(String args[]) {
        int length = 81;
        int a = 11, b=12, c=9;
        System.out.println("max is::: "+ maxCuts(length, a, b, c));
    }

    public static int maxCuts(int l, int a , int b, int c) {

        if(l<0) {
            return -1;
        }
        if(l==0) {
            return 0;
        }

        int max = Math.max(maxCuts(l-a,a, b, c), Math.max(maxCuts(l-b,a, b, c), maxCuts(l-c, a, b, c)));

        if(max == -1) {
            return -1;
        } else {
            return max+1;
        }
    }

}


