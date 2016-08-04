mport java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	String time = in.nextLine();
    	int hours = Integer.parseInt(time.substring(0,2));
    	String Hours = time.substring(0,2);
    	String minseconds = time.substring(2,8);
    	hours += (time.substring(8,10).equals("PM")&&hours < 12) ? 12: 0;
    	Hours = (time.substring(8,10).equals("AM")&&hours==12) ? "00": Hours;
    	if (hours > 12) {
    		System.out.println(hours+minseconds);
    	}
    	else {
    		System.out.println(Hours+minseconds);
    	}
    	in.close();
    }
}
