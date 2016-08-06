package CamelCase;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int upper = 1;
        String s = in.next();
        for (int i =0 ; i < s.length() ; i++) {
        	if ( Character.isUpperCase(s.charAt(i)) ) {
        		upper++;
        	}
        }
        System.out.println(upper);
        in.close();
    }
}
