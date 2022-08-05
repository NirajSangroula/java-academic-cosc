package lab5;
import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 3x3 matrix a: ");
		double[][] a = new double[3][3];
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++)
				a[i][j] = s.nextDouble();
		System.out.println("Enter 3x3 matrix b: ");
		double[][] b = new double[3][3];
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++)
				b[i][j] = s.nextDouble();
		double [][]c = multiplyMatrix(a, b);
		System.out.println("The product is");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				System.out.printf("%-6.1f", a[i][j]);
			}
			System.out.print((i == 1)?"\t*\t":"\t \t");
			for(int j = 0; j < 3; j++){
				System.out.printf("%-6.1f", b[i][j]);
			}
			System.out.print((i == 1)?"\t=\t":"\t \t");
			System.out.print("\t");
			for(int j = 0; j < 3; j++){
				System.out.printf("%-10.1f", c[i][j]);
			}
			System.out.println("\n");
		}
		
	}

	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		double[][] c = new double[3][3];
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				for(int p = 0; p < 3; p++){
					c[i][j] += a[i][p] * b[p][j];
				}
			}
		}
		return c;
	}

}
