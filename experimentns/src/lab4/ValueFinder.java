package lab4;

import java.util.Scanner;

public class ValueFinder {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter length of numbers:");
		int length = s.nextInt();
		int[] n = new int[length];
		System.out.println("Enter " + length + " numbers");
		for(int i = 1; i <= length; i++){
			n[i - 1] = s.nextInt();
		}

		System.out.println("The greatest number is " + greatest(n));
		System.out.println("The smallest number is " + smallest(n));

	}

	public static int greatest(int[] n) {
		int g = n[0];
		for(int i = 1; i < n.length; i++){
			if(g < n[i])
				g = n[i];
		}
		return g;
	}

	public static int smallest(int[] n) {
		int s = n[0];
		for(int i = 1; i < n.length; i++){
			if(s > n[i])
				s = n[i];
		}
		return s;
	}
}
