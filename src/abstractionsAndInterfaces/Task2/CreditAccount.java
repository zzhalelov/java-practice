package abstractionsAndInterfaces.Task2;

public class CreditAccount extends Account {
    int balance;

    public CreditAccount(int balance) {
        this.balance = balance;
    }

    @Override
    public void pay(int amount) {
        balance -= amount;
        System.out.println("Оплачено " + amount + " Текущий баланс: " + balance);
    }

    @Override
    public void transfer(Account account, int amount) {
        System.out.println("С кредитного счёта нельзя переводить");
    }

    @Override
    public void addMoney(int amount) {
        if (amount > balance) {
            System.out.println("Сумма пополнения превышает сумму остатка");
        } else {
            System.out.println("Пополнено на сумму " + amount + " Текущий баланс: " + balance);
        }
    }
}