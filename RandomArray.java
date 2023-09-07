import java.util.Arrays;

public class RandomArray {
    public static void main(String[] args) {
        int size = 10;
        double[] array = new double[size];

        // Заполнение массива случайными числами с использованием Math.random()
        for (int i = 0; i < size; i++) {
            array[i] = Math.random();
        }

        System.out.println("Массив до сортировки:");
        printArray(array);

        // Сортировка массива
        Arrays.sort(array);

        System.out.println("\nМассив после сортировки:");
        printArray(array);
    }

    public static void printArray(double[] array) {
        for (double value : array) {
            System.out.println(value);
        }
    }
}

