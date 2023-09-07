import java.util.Locale;
class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("Отчет о сотрудниках:");
        System.out.println("-----------------------------------");
        System.out.printf("%-20s %-10s%n", "ФИО", "Зарплата");
        System.out.println("-----------------------------------");

        for (Employee employee : employees) {
            System.out.printf(Locale.US, "%-20s $%,.2f%n", employee.getFullname(), employee.getSalary());
        }

        System.out.println("-----------------------------------");
    }
}