package assignment3;

public class Conversion {

	public static void main(String[] args) {
		System.out.printf("%-15s%-15s%-15s%-15s\n", "Kilograms", "Pounds", "Pounds", "Kilograms");
		for(int i = 1, j = 20; i < 200 || j < 520; i += 2, j += 5) {
			if(i < 200)
				System.out.printf("%-15d%-15.3f ", i, kilogramsToPounds(i));
			if(j < 520)
				System.out.printf("%-15d%-15.3f\n", j, poundsToKilograms(j));
		}
		
	}
	
	public static double poundsToKilograms(double pounds) {
		return 0.453 * pounds;
	}
	
	public static double kilogramsToPounds(double kilograms) {
		return 2.204 * kilograms;
	}

}
