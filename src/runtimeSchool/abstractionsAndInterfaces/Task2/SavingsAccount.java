package runtimeSchool.abstractionsAndInterfaces.Task2;

public class SavingsAccount extends Account {
    int balance;

    public SavingsAccount(int balance) {
        this.balance = balance;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Со сберегательного счёта нельзя платить");
    }

    @Override
    public void transfer(Account account, int amount) {
        if (amount > balance) {
            System.out.println("Сумма перевода превышает остаток на счету");
        } else {
            balance -= amount;
            System.out.println("Перевод на сумму " + amount + " Текущий баланс: " + balance);
        }
    }

    @Override
    public void addMoney(int amount) {
        balance += amount;
        System.out.println("Пополнение на сумму " + amount + " Текущий баланс: " + balance);
    }
}