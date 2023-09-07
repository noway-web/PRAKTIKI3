import java.util.Arrays;
import java.util.Random;
public class CircleTester {
    public static void main(String[] args) {
        int capacity = 5;
        Tester tester = new Tester(capacity);

        Random random = new Random();
        for (int i = 0; i < capacity; i++) {
            double x = random.nextDouble() * 10; // Случайная координата x
            double y = random.nextDouble() * 10; // Случайная координата y
            double radius = random.nextDouble() * 5; // Случайный радиус

            Point center = new Point(x, y);
            Circle circle = new Circle(center, radius);

            tester.addCircle(circle);
        }

        // Нахождение самой маленькой и самой большой окружности
        Circle smallestCircle = tester.findSmallestCircle();
        Circle largestCircle = tester.findLargestCircle();

        System.out.println("Самая маленькая окружность: Радиус = " + smallestCircle.getRadius());
        System.out.println("Самая большая окружность: Радиус = " + largestCircle.getRadius());

        // Упорядочивание окружностей по радиусу
        tester.sortCirclesByRadius();

        System.out.println("\nОтсортированные окружности по радиусу:");
        for (int i = 0; i < tester.getCount(); i++) {
            System.out.println("Радиус = " + tester.getCircles()[i].getRadius());
        }
    }
}