package cosc1047.lab3;

public class TestFraction {

	public static void main(String[] args) {
		try {
			Fraction f0 = new Fraction(4, 2);
			System.out.printf("In f0, numerator: %d, denominator: %d\n\n", f0.getNumerator(), f0.getDenominator());
			System.out.println("Creating object with 0 denominator");
			Fraction f = new Fraction(4, 0);
		}
		catch(NullDenominatorException e) {
			System.out.println(e.getMessage());
		}

	}

}
