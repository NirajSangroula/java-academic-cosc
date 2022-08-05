package lab4;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers and an operator");
		int a = s.nextInt();
		int b = s.nextInt();
		int operator = s.next().charAt(0);

		switch(operator){
			case '+': System.out.println("The sum is " + add(a, b)); break;
			case '-': System.out.println("The difference is " + subtract(a, b)); break;
			case '/': System.out.println("The quotient is " + quotient(a, b)); break;
			case '*': System.out.println("The product is " + product(a, b)); break;
			case '%': System.out.println("The remainder is " + remainder(a, b)); break;
			default: System.out.println("Invalid operator!");

		}

	}

	public static int add(int a, int b){
		return a + b;
	}

	public static int subtract(int a, int b){
		return a - b;
	}

	public static int product(int a, int b){
		return a * b;
	}

	public static double quotient(int a, int b){
		return (double)a / b;
	}

	public static int remainder(int a, int b){
		return a % b;
	}
}
