package runtimeSchool.abstractionsAndInterfaces.Task2;
//реализовать программу по работе с банковскими счетами: расчетный, кредитный, сберегательный
//write a code for working with bank accounts: checking, credit, savings
public class Main {
    public static void main(String[] args) {
        Account saving = new SavingsAccount(10000);
        Account credit = new CreditAccount(12000);
        Account checking = new CheckingAccount(15000);
        saving.addMoney(5000);
        saving.pay(1000);
        saving.transfer(checking, 2000);
        credit.pay(1000);
        credit.addMoney(1500);
        credit.transfer(saving, 500);
        checking.transfer(saving, 5000);
        checking.addMoney(2000);
        checking.pay(5000);
    }
}