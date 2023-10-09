package ConditionalStatementsAndCycles.Task5;

//Найти сумму всех чисел от 1 до 100, которые делятся на 3
//Find the sum of all numbers from 1 to 100 that are divisible by 3
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}