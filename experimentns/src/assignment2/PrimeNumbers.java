package assignment2;

public class PrimeNumbers {

	public static void main(String[] args) {
		int count = 0;
		for(int i = 2; i <= 1200; i++) {
			boolean isPrime = true;
			int divisor = 2;
			while(isPrime && divisor < i) {
				if(i % divisor == 0) {
					isPrime = false;
				}
				divisor ++;
			}
			if(isPrime) {
				count ++;
				System.out.print(i + "\t" + ((count % 15 == 0)?"\n":""));
			}
		}
		System.out.println("\nThe count of prime numbers is "+ count);
	}

	
}
