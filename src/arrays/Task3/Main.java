package arrays.Task3;
//Вывести вторую половину массива (Вывести вторую половину элементов массива при помощи цикла for). Реализация задачи должна работать при любом чётном количестве элементов
//Output the second half of the array (Output the second half of the array elements using the for loop). The task implementation should work for any even number of elements
public class Main {
    public static void main(String[] args) {
        int[] array = {7, -3, 9, -11, 18, 99, 2, 11};
        for (int i = array.length/2; i < (array.length); i++) {
            System.out.println(array[i]);
        }
    }
}