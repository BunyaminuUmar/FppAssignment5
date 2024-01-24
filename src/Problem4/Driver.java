package Problem4;

public class Driver {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new CommissionEmployee("Umar", "Bunyaminu", "123-45-6789", 50000, 0.1);
        employees[1] = new BasePlusCommissionEmployee("Ayisha", "Nuhu", "987-65-4321", 30000, 0.08, 2000);
        employees[2] = new HourlyEmployee("Aliyu", "Bunyaminu", "456-78-9012", 15, 40);
        employees[3] = new SalariedEmployee("Yakubu", "Bunyaminu", "654-32-1098", 1000);
        employees[4] = new CommissionEmployee("Amina", "Bunyaminu", "321-54-9876", 60000, 0.12);

        for (Employee employee : employees) {
            System.out.println(employee);
            System.out.printf("Payment: %.2f%n%n", employee.getPayment());
        }


        double totalSalaries = calculateTotalSalaries(employees);
        System.out.printf("Total Salaries of all Employees: %.2f%n", totalSalaries);
    }

    public static double calculateTotalSalaries(Employee[] employees) {
        double totalSalaries = 0.0;
        for (Employee employee : employees) {
            totalSalaries += employee.getPayment();
        }
        return totalSalaries;
    }
}

