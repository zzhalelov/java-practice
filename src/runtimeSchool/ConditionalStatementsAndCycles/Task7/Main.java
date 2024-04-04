package runtimeSchool.ConditionalStatementsAndCycles.Task7;

import java.util.Scanner;

//Нужно написать программу, которая будет рассчитывать количество дней в году
//need to write a code that will calculate the number of days in a year
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();
        if (year % 400 == 0) {
            System.out.println("Результат вычисления: 366. Год високосный");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Результат вычисления: 366. Год вискосный");
        } else {
            System.out.println("Результат вычисления: 365. Год не високосный");
        }
    }
}