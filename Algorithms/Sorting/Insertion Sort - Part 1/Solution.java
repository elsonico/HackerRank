import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    

	public static void insertIntoSorted(int[] ar) {
		// Fill up this function
		int S=ar.length;
		int V=ar[S-1];
		int i=1;
		while ( i < S && V <= ar[S-i-1] ){
			ar[S-i]=ar[S-i-1];
			printArray(ar);
			i++;
		}
		ar[S-i]=V;
		printArray(ar);
	}
    
    
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
