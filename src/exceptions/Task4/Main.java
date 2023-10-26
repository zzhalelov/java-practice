package exceptions.Task4;

import java.util.Scanner;
//Ask the user to enter a positive number. If it is negative, print an error message using an exception
//Попросите пользователя ввести положительное число. Если оно отрицательное, выведите сообщение об ошибке, используя исключение
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ENTER POSITIVE NUMBER: ");
            int number = scanner.nextInt();
            if (number < 0) {
                throw new IllegalArgumentException("NEGATIVE NUMBER ENTERED");
            } else {
                System.out.println("YOU ENTERED NUMBER: " + number);
            }
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        } catch (java.util.InputMismatchException ex) {
            System.err.println("ERROR! INCORRECT INPUT");
        }
    }
}