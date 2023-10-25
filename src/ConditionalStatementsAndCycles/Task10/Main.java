package ConditionalStatementsAndCycles.Task10;

import java.util.Scanner;

//Task for the switch operator: Write a program that asks the user for the number of the day of the week (1-7) and outputs the name of the day of the week (for example, "Monday", "Tuesday" and so on)
//Задача на оператор switch: Напишите программу, которая запрашивает у пользователя номер дня недели (1-7) и выводит название дня недели (например, "Понедельник", "Вторник" и так далее)
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of day: ");
        int dayOfWeek = scanner.nextInt();
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error! Enter a digit between 1-7");
        }
    }
}