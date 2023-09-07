import java.util.Arrays;
import java.util.Random;

public class RandomArray2 {
    public static void main(String[] args) {
        int size = 10;
        double[] array = new double[size];
        Random random = new Random();

        // Заполнение массива случайными числами с использованием класса Random
        for (int i = 0; i < size; i++) {
            array[i] = random.nextDouble();
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