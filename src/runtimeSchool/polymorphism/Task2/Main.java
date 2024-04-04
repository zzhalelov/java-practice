package runtimeSchool.polymorphism.Task2;

import java.math.BigDecimal;

//Бухгалтерская программа должна уметь проводить transactions. С некоторых транзакций налог платить не нужно, некоторые облагаются подоходным налогом, с некоторых необходимо уплатить НДС. Необходимо расширить функциональность класса Bill возможностью работы с различными системами налогообложения.
//An accounting program should be able to conduct transactions. Some transactions do not need to be taxed, some are subject to income tax, and some require VAT to be paid. It is necessary to extend the functionality of the Bill class with the ability to work with various tax systems.
public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                new Bill(new BigDecimal(100_00), new IncomeTaxType(), taxService),
                new Bill(new BigDecimal(150_000), new VATaxType(), taxService),
                new Bill(new BigDecimal(200_000), new ProgressiveTaxType(), taxService)
        };
        for (Bill bill : payments) {
            bill.payTaxes();
        }
    }
}