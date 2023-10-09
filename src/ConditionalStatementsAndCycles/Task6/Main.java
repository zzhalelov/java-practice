package ConditionalStatementsAndCycles.Task6;

import java.util.Scanner;

//Реализовать калькулятор, который будет выполнять операции сложения, вычитания, умножения и деления над двумя введенными числами
//Create a calculator that will perform addition, subtraction, multiplication and division operations on two entered numbers
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int num1 = scanner.nextInt();
        System.out.println("Введите арифметический знак:");
        char operator = scanner.next().charAt(0);
        System.out.println("Введите второе чило:");
        int num2 = scanner.nextInt();
        int result = 0;
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            result = num1 / num2;
        } else {
            System.out.println("Error");
        }
        System.out.println(result);
    }
}