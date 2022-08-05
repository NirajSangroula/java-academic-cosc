package assignment4;

import java.util.Scanner;

public class MarkovMatrix {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 3 X 3 matrix row-wise: ");
		double[][] m = new double[3][3];
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++)
				m[i][j] = s.nextDouble();
		System.out.println("The matrix is" + (isMarkovMatrix(m) ? " " : " not ") + "a markov matrix");

	}
	public static boolean isPositive(double a){
		return a > 0;
	}
	
	//Returns sum of i-th column of matrix m
	public static double sumOfColumn(double[][] m, int i){
		double sum = 0;
		//Iterate through each row j, but add only i-th element of that row
		for(int j = 0; j < m.length; j++){
			sum += m[j][i];
		}
		return sum;

	}
	public static boolean isMarkovMatrix(double[][] m) {
		//Iterate column wise
		for(int i = 0; i < m[0].length; i++){
			//Iterate each element in column i
			for(int j = 0; j < m.length; j++){
				if(!isPositive(m[j][i]))
					return false;
			}

			if(sumOfColumn(m, i) != 1)
				return false;
		}

		return true;
	}
}
