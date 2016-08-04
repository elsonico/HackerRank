import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int a0 = 0; a0 < t; a0++){
			int n = in.nextInt();
			int k = in.nextInt();
			ArrayList<Integer> integers = new ArrayList<Integer>();
			for(int a=1;a<n;a++){
				for (int b=a+1;b<=n;b++){
					if ((a&b) < k){
						integers.add(a&b);
					}
				}
			}
			System.out.println(Collections.max(integers));
		}
		in.close();    
	}
}
