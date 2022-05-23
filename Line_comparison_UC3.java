package com.bridgelabz;
import java.lang.*;
//import java.util.objects;
import java.util.Objects;

public class Line_comparison_UC3 {
	
	static double length(int x1, int x2, int y1, int y2) {

	return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);
}

static double length2(int p1, int p2, int q1, int q2) {
	return Math.sqrt(Math.pow(p1 - p2, 2) + Math.pow(q1 - q2, 2) * 1.0);
}

public static void main(String[] args) {
	
	
	int x1,x2,y1,y2,p1,p2,q1,q2;
	Double line1 = Math.round(length(x1= 4, x2= 7, y1= 5, y2= 9)) * 100000.0 / 100000.0;

	Double line2 = Math.round(length2(p1= 6, p2= 8, q1= 6, q2= 9)) * 100000.0 / 100000.0;
	
	System.out.println("Equality of two lines is equal =" + (Objects.equals(line2, line1)));
	int result = line1.compareTo(line2);
	
	if (result == 0) {
		
		System.out.println("Line 1 and line2 are equal :" +result);
	} else if (result > 0) {
		System.out.println("Line 1 is greater than line2 :" +result);			
	} else
		System.out.println("Line 1 is less than line2 :" +result);	

}
}
