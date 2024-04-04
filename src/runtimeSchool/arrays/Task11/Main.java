package runtimeSchool.arrays.Task11;

//Поиск дубликатов: Определите, есть ли дубликаты в массиве. Если они есть, выведите их
public class Main {
    public static void findDuplicates(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Duplicate found: " + array[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 9, 9};
        findDuplicates(array);
    }
}