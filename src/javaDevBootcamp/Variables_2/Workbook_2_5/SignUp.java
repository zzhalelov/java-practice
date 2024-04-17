package javaDevBootcamp.Variables_2.Workbook_2_5;

import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {

        // Instructions for this workbook are on Learn the Part (see the Udemy Video: Workbook 2.5 to access the link).

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");

        System.out.println("What is your first name?");
        String firstName = scan.nextLine();
        System.out.println("What is your last name?");
        String lastName = scan.nextLine();
        System.out.println("How old are you?");
        int age = scan.nextInt();
        System.out.println("Make a username");
        String userName = scan.nextLine();
        // If you experience trouble picking up the username, please carefully read the instructions on Learn the Part.

        System.out.println("What city do you live in?");
        String city = scan.nextLine();
        System.out.println("What country is that?");
        String country = scan.nextLine();
        System.out.println("Thank you for joining JavaGram!");
        System.out.println("\nHere is the information you entered:");
        System.out.println("\tFirst Name: " + firstName);
        System.out.println("\tLast Name: " + lastName);
        System.out.println("\tAge: " + age);
        System.out.println("\tUsername: " + userName);
        System.out.println("\tCity: " + city);
        System.out.println("\tCountry: " + country);

        //close scanner. It's good practice :D !
        scan.close();
    }
}