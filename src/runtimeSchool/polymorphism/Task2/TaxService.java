package runtimeSchool.polymorphism.Task2;

import java.math.BigDecimal;

public class TaxService {
    public void payOut(BigDecimal amount) {
        System.out.println("Уплачен налог в размере: " + amount);
    }
}