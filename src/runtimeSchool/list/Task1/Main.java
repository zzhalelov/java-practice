package list.Task1;

import java.util.ArrayList;
import java.util.Scanner;

//менеджер списка дел со следующим функционалом:
// Запрос списка задач у пользователя;
//Возможность добавить задачу в список;
//Возможность удалить задачу из списка;
//Возможность вывода всех задач с их номерами
//to-do list with the following functionality:
// Request a list of tasks from the user;
//Ability to add a task to the list;
//Ability to delete a task from the list;
//The ability to output all tasks with their numbers
public class Main {
    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить задачу");
            System.out.println("2. Вывести список задач");
            System.out.println("3. Удалить задачу");
            System.out.println("0. Выход");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1 -> {
                    System.out.print("Введите задачу для планирования: ");
                    String task = scanner.nextLine();
                    toDoList.add(task);
                    System.out.println("Задача успешно добавлена");
                }
                case 2 -> {
                    System.out.println("Список задач:");
                    if (toDoList.isEmpty()) {
                        System.out.println("Список пуст");
                    } else {
                        for (int i = 0; i < toDoList.size(); i++) {
                            System.out.println((i + 1) + ". " + toDoList.get(i));
                        }
                    }
                }
                case 3 -> {
                    System.out.print("Введите номер задачи для удаления: ");
                    int taskIndex = scanner.nextInt();
                    scanner.nextLine(); // Считываем символ новой строки после ввода числа
                    if (taskIndex >= 1 && taskIndex <= toDoList.size()) {
                        String removedTask = toDoList.remove(taskIndex - 1);
                        System.out.println("Задача '" + removedTask + "' успешно удалена");
                    } else {
                        System.out.println("Некорректный номер задачи");
                    }
                }
                case 0 -> {
                    System.out.println("Программа завершена");
                    return;
                }
                default -> System.out.println("Некорректный выбор");
            }
        }
    }
}