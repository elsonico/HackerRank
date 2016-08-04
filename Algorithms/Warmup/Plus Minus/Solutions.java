import java.util.*;

public class Solution {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int N=in.nextInt();
    	int n=0;
    	float neg=0,pos=0,zer=0;
    	for (int i=0;i<N;i++) {
    		n=in.nextInt();
    		pos+= ( n>0 ) ? 1 : 0;
    		neg+= ( n<0 ) ? 1 : 0;
    		zer+= ( n==0) ? 1 : 0;
    	}
    	System.out.printf("%6f\n%6f\n%6f\n",pos/N,neg/N,zer/N);
    	in.close();
    }
}
