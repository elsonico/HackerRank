import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/* Enter your code here. */
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i=0;i<T;i++) {
			int n=sc.nextInt();
			if (n%2==0 && n!=2 || n==1) {
				System.out.println("Not prime");
			}
			else
				if (n<6) {
					System.out.println("Prime");
				}
				else{
					boolean prime=true;
					for (int j=3 ;j<Math.sqrt(n); j=j+2) {
						if (n%j==0) {
							prime=false;							
						}
					}
					if (prime==true){
						System.out.println("Prime");
					}
					else {
						System.out.println("Not prime");
					}
				}
		}
		sc.close();
	}
}
