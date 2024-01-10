package M3_Recursion;

public class JosephusProblem {

//    FOR N=7 , K=3
//    AFTER 1ST KILL i.e it should return 3 i.e (0+3)%7 = 3
//    0  1  2  3 4 5 6
//    A  B  c  D E F G

//    AFTER 2ND KILL  i.e it should return 0  i.e (3+3)%6 = 0
//      0 1 2 3 4 5
//      D E f G A B

//    AFTER 3RD KILL  i.e it should return 3  i.e (0+3)%5 = 3
//      0 1 2 3 4
//      G A b D E

//    AFTER 4TH KILL i.e it should return 0  i.e (1+3)%4 = 0
//      0 1 2 3
//      D E g A

//    AFTER 5TH KILL i.e it should return 1  i.e 6th kill(1+k)%n  i.e  4%3  i.3 1
//      0 1 2
//      A D e

//    AFTER 6TH KILL i.e it should return 1  i.e  7th kill(0 + k)%n  i.e 3%2  i.e 1
//      0 1
//      a D

//    AFTER 7TH KILL  i.e it should return 0
//      0
//      D   Base case if n==1 return 0

    public static void main(String args[]) {
        int result = josephusProb(5,3);
        System.out.println("OUptu is :: "+ result);
    }

    public static int josephusProb(int n, int k) {

        if(n==1) {
            return 0;
        }

        int currentPositon = (josephusProb(n-1, k)+k)%n;
        return currentPositon;
    }
}
