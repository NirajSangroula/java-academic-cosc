package lab4;

import java.util.Scanner;

public class ArrayAverage {

	public static void main(String[] args) {
		System.out.println("Enter no of data: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("Enter " + n + " data of integer type");
		int[] intData = new int[n];
		for(int i = 1; i <= n; i++){
			intData[i - 1] = s.nextInt();
		}
		System.out.println("The average is " + average(intData));

		System.out.println("Enter " + n + " data of double type");
		double[] doubleData = new double[n];
		for(int i = 1; i <= n; i++){
			doubleData[i - 1] = s.nextDouble();
		}
		System.out.println("The average is " + average(doubleData));
	}

	public static double average(int[] array) {
		int sum = 0;
		for(int n: array)
			sum += n;
		return (double)sum / array.length;
	}

	public static double average(double[] array) {
		double sum = 0;
		for(double n: array)
			sum += n;
		return sum / array.length;
	}
}
