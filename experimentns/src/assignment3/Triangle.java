package assignment3;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the sides of triangle:");
		double s1 = s.nextDouble();
		double s2 = s.nextDouble();
		double s3 = s.nextDouble();
		if(isValid(s1, s2, s3)) {
			System.out.println("The area of triangle is " + area(s1, s2, s3));
		}
		else {
			System.out.println("The input is invalid.");
		}		
		s.close();
		
	}
	
	public static boolean isValid(double s1, double s2, double s3) {
		return s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1;
	}
	

	public static double area(double s1, double s2, double s3) {
		double s = (s1 + s2 + s3) / 2;
		return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
	}
}
