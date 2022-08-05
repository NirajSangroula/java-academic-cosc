package cosc1047.lab1;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("Factorial of " + n + " is ");
        int i = 1;
        for(char c: factorial(n).toString().toCharArray()) {
        	System.out.print(c);
        	if(i++ % 50 == 0)
        		System.out.println();
        	
        }
        s.close();
    }

    public static BigInteger factorial(int n){
        BigInteger f = BigInteger.ONE;
        for(int i = 1; i <= n; i++)
            f = f.multiply(new BigInteger(String.valueOf(i)));
        return f;
    }
}