package assignment3;

public class PallindromicPrimes {

	public static void main(String[] args) {
		final int NO_PER_LINE = 10;
		for(long i = 100, count = 0; count < 120; i++) {
			if(isPallindrome(i) && isPrime(i) ) {
				count ++;
				System.out.printf("%d\t" + ((count % NO_PER_LINE == 0)?"\n":""), i);
			}
		}
	
	}
	
	public static boolean isPrime(long n) {
		int count = 0;
		for(int i = 2; i < n; i++)
			if(n % i == 0)
				count ++;
		return count == 0;
	}
	
	public static boolean isPallindrome(long n) {
		return n == reverse(n);
	}
	
	public static long reverse(long n) {
		long rev = 0;
		while(n > 0) {
			rev = rev * 10 + (n % 10);
			n /= 10;
		}
		
		return rev;
	}
}
