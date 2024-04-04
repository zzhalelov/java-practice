package runtimeSchool.generics.Task3;

public class Main {
    public static void main(String[] args) {
        Box<String, Banana> bananaBox = new Box<>("banana", new Banana());
        bananaBox.getObj().printClass();
        Box<String, Apple> appleBox = new Box<>("apple", new Apple());
        appleBox.getObj().printClass();
        Box<String, Fruit> fruitBox = new Box<>("fruit", new Fruit());
        fruitBox.getObj().printClass();
        VegetableBox<String, Cabbage> cabbageBox = new VegetableBox<>("cabbage", new Cabbage());
        cabbageBox.getObj().printClass();
    }
}