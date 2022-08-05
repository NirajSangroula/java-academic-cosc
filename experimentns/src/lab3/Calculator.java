package lab3;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Enter two numbers and an operator: ");
		Scanner s = new Scanner(System.in);
		operate(s.nextDouble(), s.nextDouble(), s.next().charAt(0));

	}
	
	public static void operate(double a, double b, char operator) {
		System.out.printf("%.3f %c %.3f = ", a, operator, b);
		switch(operator) {
		case '+' : System.out.println(a + b); break;
		case '-' : System.out.println(a - b); break;
		case '*' : System.out.println(a * b); break;
		case '/' : System.out.println(a / b); break;
		case '%' : System.out.println(a % b); break;
		default: 
			System.out.println("Invalid operator");
		}
	}

}
