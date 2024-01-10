package M3_Recursion;

public class Permutation {

    public static void main(String args[]) {
        findPermutation("ABC", 0);
    }

    public static void findPermutation(String str, int i) {
        if(i == str.length()-1) {
            System.out.println(str);
            return;
        } else {
            for(int j=i; j<=str.length()-1; j++) {
                str = swap(str, i, j);
                findPermutation(str, i+1);
//                str= swap(str, i, j);
            }
        }

    }

    static String swap1(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static String swap(String str, int i, int j)
    {
        StringBuilder stringBuilder = new StringBuilder(str);
        char charAtJ = str.charAt(j);
        char charAtI = str.charAt(i);
        stringBuilder.setCharAt(j, charAtI);
        stringBuilder.setCharAt(i, charAtJ);
        return stringBuilder.toString();
    }

}
