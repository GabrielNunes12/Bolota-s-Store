package util;

public class CurrencyConverter {
    public static final double IOF = 0.06;
    public static double amountToBePaid (double dollarPrice, double dollarsBought) {
        double dollar = dollarPrice * dollarsBought;
        return dollar * IOF + dollar;
    }
}
