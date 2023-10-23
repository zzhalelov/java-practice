package arrays.Task10;
//Поиск среднего значения: Рассчитайте среднее значение элементов в массиве.
public class Main {
    public static int findAverageValue(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;

        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        System.out.println(findAverageValue(array));
    }
}