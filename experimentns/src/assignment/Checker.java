package assignment;

import java.util.Scanner;

public class Checker {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		if(n % 2 == 0)
			System.out.printf("%d is even.\n", n);
		else
			System.out.printf("%d is odd.\n", n);
		
		if(n % 7 == 0 && n % 5 == 0)
			System.out.printf("%d is divisible by 7 and 5.", n);
		else
			System.out.printf("%d is not divisible by 7 and 5.", n);
		scanner.close();
	}

}
