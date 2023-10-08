package ConditionalStatementsAndCycles.Task1;

//Напишите программу, которая выводит все четные числа от 1 до 10.
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}