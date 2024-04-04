package runtimeSchool.ConditionalStatementsAndCycles.Task12;

//Write a program to output the following pattern using nested loops
//Напишите программу для вывода следующего узора с использованием вложенных циклов
public class Main {
    public static void main(String[] args) {
        String str = "*";
        String newStr;
        for (int i = 1; i <= 5; i++) {
            newStr = str.repeat(i);
            System.out.println(newStr);
        }
    }
}