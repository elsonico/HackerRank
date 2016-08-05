import java.util.*;

public class Solution {
	/* There certainly is more elegant solution than mine.
	You could check (x2-x1)%(v1-v2) /*

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();
		if ((x1 > x2 && v1 > v2) || (x2 > x1 && v2 > v1) ) {
			System.out.println("NO");
			System.exit(0);
		}
		if (x1 < x2) {
			while ( x1 < x2) {
				x1 = x1+v1;
				x2 = x2+v2;			
			}
		}
		else {
			while ( x2 < x1) {
				x1 = x1+v1;
				x2 = x2+v2;				
			}
		}
		if (x1==x2) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		in.close();
	}
}
