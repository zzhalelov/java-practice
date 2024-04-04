package runtimeSchool.exceptions.Task5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Write a program that reads data from a file. Handle the exception that may occur if the file does not exist
//Напишите программу, которая читает данные из файла. Обработайте исключение, которое может возникнуть, если файл не существует
public class Main {
    public static void main(String[] args) {
        String fileName = "sample.txt";
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (java.io.FileNotFoundException e) {
            System.out.println("File '" + fileName + "' not found");
        } catch (IOException e) {
            System.out.println("An input/output error occurred while reading the file.");
        }
    }
}