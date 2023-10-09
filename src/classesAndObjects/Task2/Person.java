package classesAndObjects.Task2;

//Создать метод с параметрами.
//Создать метод с названием print Name(), который содержит 2 параметра: фамилию и имя.
//Вызвать метод и передать в него 2 аргумента.
//Create a method with parameters.
//Create a method called print Name(), which contains 2 parameters: last name and first name.
//Call the method and pass 2 arguments to it.
public class Person {
    String name;
    String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void printName() {
        System.out.println("Ваша фамилия: " + surname + ", ваше имя: " + name);
    }

    public static void main(String[] args) {
        Person task2 = new Person("Алексей", "Петров");
        task2.printName();
    }
}