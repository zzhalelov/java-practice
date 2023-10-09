package classesAndObjects.Task6;

//Создать метод с типом возвращаемого значения String, который должен возвращать строку: "Hello World"
//Create a method with the return value type String, which should return the string: "Hello World"
public class Main {
    String string = "Hello, world";

    public String print() {
        return string;
    }

    public static void main(String[] args) {
        Main task6 = new Main();
        System.out.println(task6.print());
    }
}