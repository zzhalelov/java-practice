package ConditionalStatementsAndCycles.Task3;

import java.util.Scanner;

//Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно простым
//Write a program that asks the user for a number and checks if it is prime
public class Main {
    public static void main(String[] args) {
        int number;
        boolean numberIsPrime = true;
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();
        for (int x = 2; x <= number / 2; x++) {
            int tempNumber = number % x;
            if (tempNumber == 0) {
                numberIsPrime = false;
                break;
            }
        }
        if (numberIsPrime)
            System.out.println(number + " число является простым");
        else
            System.out.println(number + " число не является простым");
    }
}