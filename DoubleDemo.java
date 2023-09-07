public class DoubleDemo {
    public static void main(String[] args) {
        // Создание объектов класса Double
        Double doubleObject1 = Double.valueOf(3.14);
        Double doubleObject2 = Double.valueOf("2.718");

        // Преобразование строки к double
        String stringValue = "5.0";
        double doubleValue = Double.parseDouble(stringValue);

        // Преобразование объекта Double ко всем примитивным типам
        double doublePrimitive = doubleObject1.doubleValue();
        float floatPrimitive = doubleObject1.floatValue();
        long longPrimitive = doubleObject1.longValue();
        int intPrimitive = doubleObject1.intValue();
        short shortPrimitive = doubleObject1.shortValue();
        byte bytePrimitive = doubleObject1.byteValue();

        // Вывод значений на консоль
        System.out.println("Значение doubleObject1: " + doubleObject1);
        System.out.println("Значение doubleObject2: " + doubleObject2);
        System.out.println("Значение doubleValue: " + doubleValue);

        // Преобразование литерала double к строке
        String d = Double.toString(3.14);
        System.out.println("Строка d: " + d);
    }
}