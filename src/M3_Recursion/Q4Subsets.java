package M3_Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class Q4Subsets {

    public static void main(String args[]) {

//        findSubsets("A", "", 0);
        powerSet("ABC");
    }


    public static void findSubsets(String str, String curr, int index) {
        if(index >= str.length()) {
            System.out.println(curr);
            return;
        }
        findSubsets(str,  curr, index+1);
        findSubsets(str, curr+str.charAt(index), index+1);
    }

    //Alternative way using arraylist
    static ArrayList<String> powerSet(String s)
    {
        // add your code here
//        ArrayList ls = new ArrayList<>();
        findSubString(s, "", 0);
        Collections.sort(ls);
        return ls;
    }

    static ArrayList<String> ls = new ArrayList<>();

    static void findSubString(String str, String currentString, int index) {

        if(index>=str.length()) {
            ls.add(currentString);
            return;
        }
        findSubString(str, currentString, index+1);
        findSubString(str, currentString + str.charAt(index), index+1);
    }
}
