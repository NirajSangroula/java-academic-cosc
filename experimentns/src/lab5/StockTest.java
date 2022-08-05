package lab5;

public class StockTest {
    public static void main(String[] args) {
        Stock s1 = new Stock("ORCL", "Oracle Corporation");
        s1.setPreviousClosingPrice(34.5);
        s1.setCurrentPrice(34.35);
        System.out.printf("For %s (%s)\n", s1.getName(), s1.getSymbol());
        System.out.println("Previous closing price: " + s1.getPreviousClosingPrice());

        System.out.println("Current closing price: " + s1.getCurrentPrice());
        System.out.printf("Price change percentage: %.2f%%", s1.getChangePercent());
    }
}
