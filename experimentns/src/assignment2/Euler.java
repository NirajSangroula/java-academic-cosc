package assignment2;

public class Euler {
	public static void main(String args[]) {
		double e = 1;
		final int N = 20;
		for(int i = 1; i <= N; i++) {
			int factorial = 1;
			for(int j = 1; j <= i; j++) {
				factorial *= j;
			}
			e += (1D / factorial);
		}
		System.out.println("Value of e is " + e);
	}
}
