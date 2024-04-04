package runtimeSchool.exceptions.Task7;

import java.util.Scanner;
//Ask the user to enter a number. If it enters a non-numeric value, handle the NumberFormatException exception
//Попросите пользователя ввести число. Если он вводит нечисловое значение, обработайте исключение NumberFormatException
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("ENTER NUMBER: ");
            String input = scanner.nextLine();
            int num = Integer.parseInt(input);
            System.out.println("You entered number: " + num);
        } catch (NumberFormatException ex) {
            System.err.println("ERROR! ENTERED VALUE IS NOT NUMBER");
        }
    }
}