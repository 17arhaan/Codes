class Employee {
    private String name;
    protected double salary;

    public Employee(String name) {
        this.name = name;
    }

    public void printSalary() {
        System.out.println("Employee: " + name);
        System.out.println("Weekly Salary: $" + salary);
    }
}

class SalariedEmployee extends Employee {
    private static final double SALARY_RATE = 1000.0;

    public SalariedEmployee(String name) {
        super(name);
        this.calculateSalary();
    }

    private void calculateSalary() {
        this.salary = SALARY_RATE;
    }
}

class HourlyEmployee extends Employee {
    private static final double HOURLY_RATE = 20.0;
    private static final double OVERTIME_RATE = 1.5;
    private int hoursWorked;

    public HourlyEmployee(String name, int hoursWorked) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.calculateSalary();
    }

    private void calculateSalary() {
        if (hoursWorked <= 40) {
            this.salary = hoursWorked * HOURLY_RATE;
        } else {
            int regularHours = 40;
            int overtimeHours = hoursWorked - 40;
            this.salary = (regularHours * HOURLY_RATE) + (overtimeHours * HOURLY_RATE * OVERTIME_RATE);
        }
    }
}

class CommissionEmployee extends Employee {
    private static final double COMMISSION_RATE = 0.1;
    private double sales;

    public CommissionEmployee(String name, double sales) {
        super(name);
        this.sales = sales;
        this.calculateSalary();
    }

    private void calculateSalary() {
        this.salary = sales * COMMISSION_RATE;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new SalariedEmployee("Alice");
        employees[1] = new HourlyEmployee("Bob", 45);
        employees[2] = new CommissionEmployee("Charlie", 5000);

        for (Employee employee : employees) {
            employee.printSalary();
            System.out.println();
        }
    }
}