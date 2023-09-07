import java.util.Random;
import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Введите размер массива (натуральное число больше 0): ");
            while (!scanner.hasNextInt()) {
                System.out.print("Введите корректное натуральное число: ");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n <= 0);

        int[] array = new int[n];

        Random random = new Random();

        System.out.println("Массив из случайных чисел:");
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(n + 1); // Генерация числа в диапазоне [0; n]
            System.out.print(array[i] + " ");
        }

        System.out.println("\nМассив из четных элементов:");

        int evenCount = 0; // Количество четных элементов
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            }
        }

        if (evenCount == 0) {
            System.out.println("В исходном массиве нет четных чисел.");
        } else {
            int[] evenArray = new int[evenCount];
            int index = 0;

            for (int i = 0; i < n; i++) {
                if (array[i] % 2 == 0) {
                    evenArray[index] = array[i];
                    System.out.print(evenArray[index] + " ");
                    index++;
                }
            }
        }
    }
}