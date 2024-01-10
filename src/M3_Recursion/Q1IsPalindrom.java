package M3_Recursion;

public class Q1IsPalindrom{

    public static void main(String []args){
        System.out.println("Hello, World!");
        String str= "jabbaj";
        if(rec(str) == true) {
            System.out.println("Palindrome");
        } else {
            System.out.println("No pal");
        }
    }

    public static boolean rec(String str) {
        int size = str.length();
        if(size == 0 || size == 1) {
            return true;
        }

        if(str.charAt(0)==(str.charAt(size-1))) {
            return rec(str.substring(1, size-1));
        } else {
            return false;
        }
    }
}
