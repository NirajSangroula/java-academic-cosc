package assignment2;

public class Pyramid {

	public static void main(String[] args) {
		int n = 8;
		for(int i = 1; i <= n; i++) {
			for(int s = n; s > i; s--) {
				System.out.print("\t");
				
			}
			
			for(int f = 1; f < (int) Math.pow(3, i - 1); f *= 3) {
				System.out.print(f + "\t");
			}
			
			for(int l = (int) Math.pow(3, i - 1); l >= 1; l /= 3) {
				System.out.print(l + "\t");
			}
			System.out.println("\n");
			
		}

	}

}
