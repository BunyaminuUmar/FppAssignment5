package Problem4;

public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String ssn, double hours, double wage) {
        super(firstName, lastName, ssn);
        this.hours = hours;
        this.wage = wage;
    }

    @Override
    public double getPayment() {
        return wage * hours;
    }
    @Override
    public String toString() {
        return super.toString() + String.format("Wage: %.2f%nHours: %.2f%n", wage, hours);
    }
}
