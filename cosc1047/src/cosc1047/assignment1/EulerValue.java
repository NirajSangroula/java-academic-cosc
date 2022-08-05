package cosc1047.assignment1;

import java.math.*;

public class EulerValue {
    public static void main(String[] args){
        for(int i = 100; i <= 1000; i += 100){
        BigDecimal e = BigDecimal.ONE;
            for(int j = 1; j <= i; j++){
                BigDecimal factorialOfJ = new BigDecimal(factorial(j).toString());
                BigDecimal unit = new BigDecimal(BigDecimal.ONE.divide(factorialOfJ, 25, RoundingMode.HALF_UP).toString());
                e = e.add(unit);
            }
            System.out.printf("For %d iterations, e = %s \n\n", i, e);
        }
    }

	public static BigInteger factorial(int n){
		BigInteger i = BigInteger.ONE;
		for(int j = 1; j <= n; j++)
			i = i.multiply(new BigInteger(String.valueOf(j)));
		return i;
	}
}
