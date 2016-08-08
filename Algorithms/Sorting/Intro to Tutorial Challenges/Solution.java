import java.util.*;

public class FindIndex {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	int V = in.nextInt();
    	int n = in.nextInt();
    	int I = 0;
    	for (int i=0;i<n;i++) {
    		if (in.nextInt()==V) {
    			I=i;
    		}
    	}
    	System.out.println(I);
		in.close();
    }
}
