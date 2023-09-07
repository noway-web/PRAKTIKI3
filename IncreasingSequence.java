import java.util.Random;

public class IncreasingSequence {
    public static void main(String[] args) {
        int[] array = new int[4];
        Random random = new Random();

        // Заполнение массива случайными целыми числами от 10 до 99
        for (int i = 0; i < 4; i++) {
            array[i] = random.nextInt(90) + 10; // Генерация числа в диапазоне [10; 99]
        }

        // Вывод массива на экран
        System.out.print("Массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        // Проверка на строго возрастающую последовательность
        boolean isIncreasing = true;
        for (int i = 1; i < 4; i++) {
            if (array[i] <= array[i - 1]) {
                isIncreasing = false;
                break;
            }
        }

        if (isIncreasing) {
            System.out.println("\nМассив является строго возрастающей последовательностью.");
        } else {
            System.out.println("\nМассив не является строго возрастающей последовательностью.");
        }
    }
}