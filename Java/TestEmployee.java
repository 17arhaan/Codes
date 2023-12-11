// Employee class (base class)
class Employee {
    private String name;

    // Constructor
    public Employee(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Method to be overridden by subclasses
    public double calculateSalary() {
        return 0.0;
    }

    // Method to print employee name and salary
    public void printInfo() {
        System.out.println("Employee Name: " + getName());
        System.out.println("Weekly Salary: $" + calculateSalary());
    }
}

// SalariedEmployee class (inherits from Employee)
class SalariedEmployee extends Employee {
    private double weeklySalary;

    // Constructor
    public SalariedEmployee(String name, double weeklySalary) {
        super(name);
        this.weeklySalary = weeklySalary;
    }

    // Override calculateSalary method
    @Override
    public double calculateSalary() {
        return weeklySalary;
    }
}

// HourlyEmployee class (inherits from Employee)
class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    // Constructor
    public HourlyEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Override calculateSalary method
    @Override
    public double calculateSalary() {
        if (hoursWorked <= 40) {
            return hourlyRate * hoursWorked;
        } else {
            // Overtime calculation (1.5 times hourly rate for hours over 40)
            return hourlyRate * 40 + 1.5 * hourlyRate * (hoursWorked - 40);
        }
    }
}

// CommissionEmployee class (inherits from Employee)
class CommissionEmployee extends Employee {
    private double sales;
    private double commissionRate;

    // Constructor
    public CommissionEmployee(String name, double sales, double commissionRate) {
        super(name);
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    // Override calculateSalary method
    @Override
    public double calculateSalary() {
        return sales * commissionRate;
    }
}

// Test class to demonstrate functionality
public class TestEmployee {
    public static void main(String[] args) {
        // Create instances of different employee types
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", 1000.0);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Jane", 20.0, 45);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Bob", 5000.0, 0.1);

        // Demonstrate dynamic method dispatch
        displayEmployeeInformation(salariedEmployee);
        displayEmployeeInformation(hourlyEmployee);
        displayEmployeeInformation(commissionEmployee);
    }

    // Method to display employee information using dynamic method dispatch
    public static void displayEmployeeInformation(Employee employee) {
        employee.printInfo();
        System.out.println(); // Add a newline for better readability
    }
}
