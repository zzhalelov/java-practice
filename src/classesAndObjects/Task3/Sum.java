package classesAndObjects.Task3;
//Создать метод с параметрами.
//Создать метод с названием print Sum(), который содержит 3 параметра: a, b, c и выводит сумму трех чисел в консоль.
//Вызвать метод и передать в него 3 аргумента
//Create a method with parameters.
//Create a method called print Sum(), which contains 3 parameters: a, b, c and outputs the sum of three numbers to the console.
//Call the method and pass 3 arguments to it
public class Sum {
    int a;
    int b;
    int c;
    public Sum(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void printSum() {
        int sum = a + b + c;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Sum task3 = new Sum(3, 4, 5);
        task3.printSum();
    }
}