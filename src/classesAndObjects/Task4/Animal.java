package classesAndObjects.Task4;

//Создать четыре поля (переменных). Создать 2 локальные переменные в методе eat()
//Create four fields (variables). Create 2 local variables in the eat() method
public class Animal {
    public String name;
    public int age;
    public String species;
    double weight;

    public Animal(String name, int age, String species, double weight) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.weight = weight;
    }

    public void eat() {
        String food = "grass";
        int portions = 2;
        System.out.println(name + " is eating " + portions + " portions of " + food);
    }

    public static void main(String[] args) {
        Animal task4 = new Animal("Bamby", 8, "grass", 120);
        task4.eat();
    }
}