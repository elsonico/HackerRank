import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] a = new int[3];
		int[] b = new int[3];
		a[0] = in.nextInt();
		a[1] = in.nextInt();
		a[2] = in.nextInt();
		b[0] = in.nextInt();
		b[1] = in.nextInt();
		b[2] = in.nextInt();
		int a_=0;
		int b_=0;
		for (int i=0;i<3;i++){
			if (a[i]>b[i]) {
				a_++;
			}
			else if (a[i]<b[i]){
				b_++;
			}
		}
		System.out.println(a_+" "+b_);
		in.close();
	}
}
