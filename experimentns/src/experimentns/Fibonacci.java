package experimentns;

import java.util.Iterator;
import java.util.Scanner;

public class Fibonacci {
	public static int funct(int n) {
		int a = 0;
		int b = 1;
		if(n == 1)
			return a;
		else if(n == 2)
			return b;
		else
			return(funct(n-1) + funct(n-2));


	}
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			for(int i = 1; i <= n; i++) {
				System.out.println(funct(i));
			}
			for(int i = 3; i <= n; i++) {
				int nm2 = 0;
				int nm1 = 1;
				//System.out.println(nm1 + nm2);
				System.out.println((n-5) * (nm1 + 2 * nm2));
				
			}
		}
		
	}

}
