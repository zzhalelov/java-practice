package runtimeSchool.polymorphism.Task2;

import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType {
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal limit = new BigDecimal(100_000);
        return switch (amount.compareTo(limit)) {
            case -1 -> amount.multiply(new BigDecimal("0.10"));
            case 1 -> amount.multiply(new BigDecimal("0.15"));
            default -> amount;
        };
    }
}