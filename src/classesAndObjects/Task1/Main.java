package classesAndObjects.Task1;

//нужно описать класс - Car, создать объекты и присвоить в переменные объекта значения и вывести
//need to describe the class - Car, create objects and assign values to the object variables and output
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "X5", 230);
        Car car2 = new Car("Audi", "A6", 240);
        car1.start();
        car2.stop();
        System.out.println(car1);
        System.out.println(car2);
    }
}