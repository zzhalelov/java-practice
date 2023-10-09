package arrays.Task2;

//Вывести первую половину массива (Вывести первую первую половину элементов массива при помощи цикла for). Реализация задачи должна работать при любом чётном количестве элементов
//Output the first half of the array (Output the first first half of the array elements using the for loop). The task implementation should work for any even number of elements
public class Main {
    public static void main(String[] args) {
        int[] array = {7, -3, 9, -11, 18, 99, 2, 11};
        for (int i = 0; i < (array.length / 2); i++) {
            System.out.println(array[i]);
        }
    }
}