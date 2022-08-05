package lab3;

public class CrapsGame {

	public static void main(String[] args) {
		
	int previousPoint = 0;
		int a = (int)(Math.random() * 6) + 1;
		int b = (int)(Math.random() * 6) + 1;
		System.out.printf("You rolled %d + %d = %d.\n", a, b, a + b);
		switch(a + b) {
		case 2: case 3: case 12:
			System.out.printf("Score %d is Craps. You Lose!!", a + b);
			break;
		case 7: case 11:
			System.out.printf("Score %d is Natural. You win!", a + b);
			break;
		default: 
			boolean hasPoint = true;
			while(hasPoint) {
				if(a + b == 7) {
					System.out.println("You lose!");
					hasPoint = false;
				}
				else if(a + b == previousPoint) {
					System.out.printf("You win!", a + b);
					hasPoint = false;
				}
				else {
					previousPoint = a + b;
					a = (int)(Math.random() * 6) + 1;
					b = (int)(Math.random() * 6) + 1;
					System.out.printf("You rolled %d + %d = %d.\n", a, b, a + b);
				}
			}
		}
	}

}
