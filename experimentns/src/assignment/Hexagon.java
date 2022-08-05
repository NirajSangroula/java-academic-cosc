package assignment;

import java.util.Scanner;

public class Hexagon {

	public static void main(String[] args) {
		System.out.println("Enter the length of a side of hexagon:");
		Scanner scanner = new Scanner(System.in);
		double s = scanner.nextDouble();
		double area = (6 * s * s) / (4 * Math.tan(Math.PI / 6));
		System.out.printf("The area of hexagon with side %.2f is %.2f",s ,area);
		scanner.close();
	}
	
}
