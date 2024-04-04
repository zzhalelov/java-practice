package runtimeSchool.ConditionalStatementsAndCycles.Task4;

import java.util.Scanner;

//Напишите программу, которая запрашивает у пользователя число и выводит на экран его факториал.
//write a program that asks the user for a number and displays its factorial
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println("Факториал числа " + num + " равен " + result);
    }
}