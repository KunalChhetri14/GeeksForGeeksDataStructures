package M3_Recursion;

public class Q5TowerOfHanoi {

    public static void main(String args[]) {
        findSteps(2, "A", "B", "C");
    }

    public static void findSteps(int n,String A,  String B, String C) {
        if(n==1) {
            System.out.println("move disk : "+ n + " from "+ A + " to "+ C);
            return;
        }
        findSteps(n-1, A, C, B );
        System.out.println("move disk : "+ n + " from "+ A + " to "+ C);
        findSteps(n-1, B, A, C);

    }
}
