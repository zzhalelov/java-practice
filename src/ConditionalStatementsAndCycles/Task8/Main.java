package ConditionalStatementsAndCycles.Task8;

import java.util.Scanner;

//Напишите программу, которая запрашивает у пользователя числа до тех пор, пока он не введет число 0. Затем программа выводит сумму всех введенных чисел
//Write a code that asks the user for numbers until he enters the number 0. Then the program outputs the sum of all the entered numbers
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;
        System.out.println("Enter numbers. Enter '0' for exit");
        while (true) {
            System.out.println("Enter number: ");
            number = scanner.nextInt();

            if (number == 0) {
                break;
            }
            sum += number;
        }
        System.out.println("Sum of entered numbers: " + sum);
    }
}