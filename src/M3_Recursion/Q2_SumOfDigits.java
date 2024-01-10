package M3_Recursion;

public class Q2_SumOfDigits {

    public static void main(String args[]) {
        System.out.println("SUm of digits is:: "+ findSumOfDigits(253));
    }

    public static int findSumOfDigits(int no) {
        if(no <= 9) {
            return no;
        }

        return (no%10) + findSumOfDigits(no/10);
    }
}
