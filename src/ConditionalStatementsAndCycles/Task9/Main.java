package ConditionalStatementsAndCycles.Task9;
import java.util.Scanner;
//Задача на do-while-цикл:
//Напишите программу, которая предлагает пользователю ввести пароль. Если введенный пароль не совпадает с заданным паролем, программа продолжает запрашивать пароль до тех пор, пока не будет введен правильный пароль
//A do-while-loop task:
//Write a program that prompts the user to enter a password. If the entered password does not match the specified password, the program continues to request the password until the correct password is entered
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pswd;
        do {
            System.out.println("Enter password: ");
            pswd = scanner.nextInt();
        } while (pswd != 12345);
    }
}