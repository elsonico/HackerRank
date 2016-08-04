import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main (String[] args) {
		int fine = 0;
		Scanner sc = new Scanner(System.in);
		int acdd = sc.nextInt();
		int acmm = sc.nextInt();
		int acyyyy = sc.nextInt();
		int exdd = sc.nextInt();
		int exmm = sc.nextInt();
		int exyyyy = sc.nextInt();

		String actual= Integer.toString(acmm)+"/"+Integer.toString(acdd)+"/"+Integer.toString(acyyyy);
		String expected= Integer.toString(exmm)+"/"+Integer.toString(exdd)+"/"+Integer.toString(exyyyy);
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");

		Date actualDate = null;
		Date expectedDate = null;
		try {
			actualDate = df.parse(actual);
			expectedDate = df.parse(expected);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		if (actualDate.after(expectedDate)) {
			if (acyyyy > exyyyy) {
				fine=10000;
			}
			else {
				if  (acmm > exmm){
					fine = (acmm-exmm)*500;
			}
				else {
					fine = (acdd-exdd)*15;
				}
			}
		}
		System.out.println(fine);

		sc.close();
	}

}
