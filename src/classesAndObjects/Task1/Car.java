package classesAndObjects.Task1;

public class Car {
    String brand;
    String model;
    int speed;

    public Car(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    public void start() {
        System.out.println("Car is starting");
    }

    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public String toString() {
        return "Task1_Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }
}