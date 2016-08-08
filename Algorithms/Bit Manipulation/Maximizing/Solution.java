import java.util.*;

public class Solution {
    static int maxXor(int l, int r) {
    	ArrayList<Integer> arr = new ArrayList<Integer>();
    	for ( int l_ = l; l_ <= r ; l_++) {
    		for (int r_ = l ; r_ <= r ; r_++ ) {
    			arr.add(l_^(r_));
    		}
    	}
    	return Collections.max(arr);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res);
        in.close();
    }
}
