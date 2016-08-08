import java.util.*;

public class Solution {

	public static void insertIntoSorted(int[] ar) {
		// Fill up this function
		int S=ar.length;
		int i=S-1;
		int V=ar[i];
		while ( i > 0 && V <= ar[i-1] ){
			ar[i]=ar[i-1];
			printArray(ar);
			i--;
		}
		ar[i]=V;
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
		in.close();
	}

	private static void printArray(int[] ar) {
		for(int n: ar){
			System.out.print(n+" ");
		}
		System.out.println("");
	}
}
