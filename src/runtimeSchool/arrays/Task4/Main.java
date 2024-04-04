package runtimeSchool.arrays.Task4;

//Вывести все элементы кроме первого и последнего
//Output all elements except the first and last
public class Main {
    public static void main(String[] args) {
        int[] array = {7, -3, 9, -11, 18, 99, 2, 11};
        for (int i = 1; i < array.length - 1; i++) {
            System.out.println(array[i]);
        }
    }
}