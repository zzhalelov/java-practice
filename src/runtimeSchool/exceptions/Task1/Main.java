package runtimeSchool.exceptions.Task1;

import java.util.Scanner;

//нужно запросить логин или пароль пользователя. Если один из введенных параметров не совпадает (логин/пароль), то нужно выбросить checked исключение UserNotFoundException. Если возраст пользователя менее 18 лет, то нужно выбросить исключение AccessDeniedException, а если 18 и больше лет - вывести сообщение "Доступ предоставлен"
//need to request the username or password of the user. If one of the entered parameters does not match (login/password), then you need to throw a checked UserNotFoundException exception. If the user is less than 18 years old, then you need to throw the AccessDeniedException exception, and if 18 or older, display the message "Access granted"
public class Main {
    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();
        //Проверить логин и пароль
        getUserByLoginAndPassword(login, password);
        //Вызвать методы валидации пользователя
        validateUser(getUserByLoginAndPassword(login, password));
        System.out.println("Access is allowed");
    }

    public static User[] getUsers() {
        User user1 = new User("jhon", "jhon@gmail.com", "pass", 24);
        User user2 = new User("alex", "123@mail.ru", "qwerty", 25);
        User user3 = new User("tom", "789@mail.ru", "qweasd123", 17);
        return new User[]{user1, user2, user3};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.getAge() < 18) {
            throw new AccessDeniedException("Age validation is not passed");
        }
    }
}