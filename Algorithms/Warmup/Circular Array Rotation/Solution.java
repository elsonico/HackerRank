import java.util.*;

public class Solution {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	int k = in.nextInt();
    	k = k%n;
    	int q = in.nextInt();
    	int [] a = new int[n];
    	for ( int i = 0 ; i < n ; i++) {
    		a[i] = in.nextInt();
    	}
    	for ( int j = 0 ; j < q ; j++) {
    		int qi = in.nextInt();
    		if ( qi-k >= 0 ) {
    			System.out.println(a[qi-k]);
    		}
    		else {
    			System.out.println(a[qi-k+n]);
    		}
    		
    	}    	
    	in.close();
    }
}
