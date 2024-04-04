package runtimeSchool.ConditionalStatementsAndCycles.Task11;
//Write a program that finds the smallest number that is divisible by both 5 and 7. Start with 1 and increase the number until you find one
//Напишите программу, которая находит наименьшее число, которое делится и на 5, и на 7. Начните с 1 и увеличивайте число, пока не найдете такое
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.print(i + " ");
                break;
            }
        }
    }
}