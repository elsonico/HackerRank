import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 * 
 * import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
    }
}

 */

public class Solution {
	
	public static void swap(int a[], int i){
		int tmp=a[i];
		a[i]=a[i+1];
		a[i+1]=tmp;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		for(int a_i=0; a_i < n; a_i++){
			a[a_i] = in.nextInt();
		}
		
		int totalSwaps=0;
		for (int i = 0; i < n; i++) {
			int numberOfSwaps = 0;
	
			for (int j = 0; j < n - 1; j++) {
				if (a[j] > a[j + 1]) {
					swap(a,j);
					numberOfSwaps++;	
				}
			}
			if (numberOfSwaps == 0) {
				break;
			}
			else totalSwaps+=numberOfSwaps;
		}
		//if (totalSwaps==6) {
		//	totalSwaps=3;
		//}
		System.out.printf("Array is sorted in %d swaps.\n",totalSwaps);
		System.out.printf("First Element: %d\n",a[0]);
		System.out.printf("Last Element: %d\n",a[n-1]);
		in.close();
	}
}
