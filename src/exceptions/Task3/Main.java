package exceptions.Task3;

import java.util.Scanner;
//Write a program in which the user enters two numbers, and the program performs the division of one number by another. Handle the exception that may occur when dividing by zero
//Напишите программу, в которой пользователь вводит два числа, и программа выполняет деление одного числа на другое. Обработайте исключение, которое может возникнуть при делении на ноль
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER FIRST NUMBER: ");
        int x = scanner.nextInt();
        System.out.print("ENTER SECOND NUMBER: ");
        int y = scanner.nextInt();
        try {
            int result = x / y;
            System.out.println("RESULT = " + result);
        } catch (ArithmeticException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
}