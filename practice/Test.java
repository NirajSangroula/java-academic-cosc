import java.math.*;

public class Test{
    public static void main(String[] args) {
        BigInteger i = new BigInteger("444444444444444444444444433333333333333333311111111111");
        System.out.println(i.divide(BigInteger.TWO));

        BigDecimal bd = new BigDecimal("99999999999999999999999999999999999999994444444444444444444111111111111111111111");
        System.out.println(bd.divide(new BigDecimal(3), 10, RoundingMode.HALF_UP));


        String formattedOne = String.format("%5.2f %,d", 43.5, 5545544);
        System.out.println(formattedOne);
    }
}