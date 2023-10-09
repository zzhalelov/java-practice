package classesAndObjects.Task5;

//Создать метод с типом возвращаемого значения int, который должен возвращать сумму 25 и 24
//Create a method with the return value type int, which should return the sum of 25 and 24
public class Sum {
    int a;
    int b;

    public Sum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum() {
        return a + b;
    }

    public static void main(String[] args) {
        Sum task5 = new Sum(24, 25);
        task5.sum();
        System.out.println(task5.sum());
    }
}