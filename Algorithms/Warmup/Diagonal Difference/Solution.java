import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	int N=in.nextInt();
    	int[][] matrix = new int[N+1][N+1];
    	for (int y=0;y<N;y++) {
    		for (int x=0;x<N;x++){
    			matrix[x][y]=in.nextInt();
    		}
    	}
        int d1=0;
        int d2=0;
        for (int i=0;i<N;i++){
        	d1=d1+matrix[i][i];
        	d2=d2+matrix[i][(N-1)-i];
        }
        System.out.println(Math.abs(d1-d2));
    }
}
