public class EmployeeReportGenerator {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Иванов Иван Иванович", 50000.00),
                new Employee("Петров Петр Петрович", 60000.50),
                new Employee("Сидоров Сидор Сидорович", 75000.75)
        };

        Report.generateReport(employees);
    }
}