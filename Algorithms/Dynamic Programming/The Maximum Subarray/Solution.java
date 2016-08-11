import java.util.*;

public class Solution {
	public static int nonContMax(ArrayList<Integer> arr) {
		int i = 0;
		int sum = 0;
		while ( i< arr.size()) {
			if ( arr.get(i) > 0 )
				sum+=arr.get(i);
			i++;
		}
		if (arr.size() > 0 &&  sum ==0 ) {
			return Collections.max(arr);
		}
		else {
			return sum;
		}
	}
	
	public static int contMax(ArrayList<Integer> arr) {
		int max_ending_here = 0;
		int max_so_far = 0;
		for ( int i = 0 ; i < arr.size() ; i++) {
			max_ending_here = Math.max(0, max_ending_here+arr.get(i));
			max_so_far = Math.max(max_so_far,  max_ending_here);
		}
		if (arr.size() > 0 &&  max_so_far ==0 ) {
			return Collections.max(arr);
		}
		else {
			return max_so_far;
		}
	}
	
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner sc = new Scanner(System.in);
    	int T = sc.nextInt();
    	int t = 0;
    	ArrayList<Integer> numbers = new ArrayList<Integer>();

    	while ( t < T) {
    		int N = sc.nextInt();
    		for ( int i = 0 ; i < N ; i++) {
    			numbers.add(sc.nextInt());
    		}
    		System.out.print(contMax(numbers)+" "+nonContMax(numbers)+"\n");
    		numbers.clear();
    		t++;
    	}
    	sc.close();
    }
}
