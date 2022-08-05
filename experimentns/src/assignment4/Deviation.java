package assignment4;

import java.util.Scanner;

public class Deviation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of data: ");;
		int n = s.nextInt();
		System.out.println("Enter " + n + " data: ");
		double[] x = new double[n];
		for(int i = 0; i < n; i++)
			x[i] = s.nextDouble();
		System.out.printf("Mean : %.2f Standard deviation : %.4f", mean(x), deviation(x));

	}

	public static double deviation(double[] x) {
		double sumOfDifferenceSquared = 0;
		for(int i = 0; i < x.length; i++){
			sumOfDifferenceSquared += Math.pow((x[i] - mean(x)), 2);
		}
		return Math.sqrt(sumOfDifferenceSquared / (x.length - 1));
	}
	
	public static double mean(double[] x) {
		double sum = 0;
		for(int i = 0; i < x.length; i++){
			sum += x[i];
		}
		return sum / x.length;

	}

}
