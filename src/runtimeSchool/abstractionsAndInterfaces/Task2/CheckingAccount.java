package runtimeSchool.abstractionsAndInterfaces.Task2;

public class CheckingAccount extends Account {
    int balance;

    public CheckingAccount(int balance) {
        this.balance = balance;
    }

    @Override
    public void pay(int amount) {
        if (amount > balance) {
            System.out.println("На счету недостаточно средств для оплаты");
        } else {
            balance -= amount;
            System.out.println("Оплачено " + amount + " Текущий баланс: " + balance);
        }
    }

    @Override
    public void transfer(Account account, int amount) {
        if (amount > balance) {
            System.out.println("На счету недостаточно средств для перевода");
        } else {
            balance -= amount;
            System.out.println("Переведено " + amount + " Текущий баланс: " + balance);
        }
    }

    @Override
    public void addMoney(int amount) {
        balance += amount;
        System.out.println("Пополнено на сумму " + amount + " Текущий баланс: " + balance);
    }
}