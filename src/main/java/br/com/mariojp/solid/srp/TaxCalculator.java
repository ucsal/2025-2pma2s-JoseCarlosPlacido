package br.com.mariojp.solid.srp;

public class TaxCalculator {

    public double calculate(double subtotal) {
        String taxRateProperty = System.getProperty("tax.rate", "0.10");
        double taxRate = Double.parseDouble(taxRateProperty);
        return subtotal * taxRate;
    }
}