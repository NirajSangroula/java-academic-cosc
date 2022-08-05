package lab3;

public class TuitionFees {

	public static final double RATE = 0.05;
	public static void main(String[] args) {
		double initialFee = 10000;
		System.out.printf("The fees after 10 years is $%.3f.\n", feeAfter(initialFee, 10));
		double cost = feeAfter(initialFee, 10) + feeAfter(initialFee, 11) + feeAfter(initialFee, 12) + feeAfter(initialFee, 13);
		System.out.printf("Total cost of four years worth after tenth years is $%.3f.\n", cost);
		
	}
	
	public static double feeAfter(double fee, int n) {
		for(int i = 1; i <= n; i++) {
			fee += RATE * fee;
		}
		return fee;
	}

}
