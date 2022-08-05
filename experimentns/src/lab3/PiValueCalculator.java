package lab3;

public class PiValueCalculator {

	public static void main(String[] args) {
		for(int i = 10000; i <= 100000; i += 10000) {
			System.out.printf("For %d iterations, PI = %f\n", i, valueAfterReps(i));
		}
	}
	
	public static double valueAfterReps(int n) {
		double delta = 0;
		for(int i = 1; i <= n; i++) {
			delta += (Math.pow(-1, i + 1)/ (2 * i - 1));
		}
		
		return 4 * delta;
	}

}
