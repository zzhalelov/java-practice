package runtimeSchool.hashMapAndHashSet.Task2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//система учета студентов. Для каждого студента нужно хранить следующие данные – ФИО, номер группы, номер студенческого билета. Уникальным идентификатором является номер студенческого билета. Пользователь вводит данные студентов в бесконечном цикле до ввода команды "end". По окончании ввода программа должна вывести список студентов. Структура данных, куда сохраняются студенты, должна отбрасывать ввод студента с уже существующим в базе id и писать об этом пользователю. Учитывайте, что имена у людей могут быть одинаковыми, а номера документов – нет
//student accounting system. For each student, you need to store the following data – full name, group number, student ID number. The unique identifier is the student ID number. The user enters student data in an infinite loop before entering the "end" command. At the end of the input, the program should output a list of students. The data structure where students are saved should discard the input of a student with an id already existing in the database and write about it to the user. Keep in mind that people's names may be the same, but the document numbers are not
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Student> students = new HashSet<>();
        System.out.println("Введите информацию о студентах. Для завершения введите 'end'");
        while (true) {
            System.out.println("Имя студента: ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("end")) {
                break;
            }
            System.out.println("Номер группы: ");
            String group = scanner.nextLine();
            if (group.equalsIgnoreCase("end")) {
                break;
            }
            System.out.println("Номер студенческого билета: ");
            String studentId = scanner.nextLine();
            if (studentId.equalsIgnoreCase("end")) {
                break;
            }
            Student newStudent = new Student(name, group, studentId);
            if (students.contains(newStudent)) {
                System.out.println("Студент с таким номером студ.билета уже существует");
            } else {
                students.add(newStudent);
            }
        }
        System.out.println("Список студентов: ");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}