class Employee {
    String empName;
    double salary;
    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    Employee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }
}

public class Employee_Company_Information_Management {
    public static void main(String[] args) {
        new Employee("Divya", 65000);
        new Employee("Arjun", 30000);
        new Employee("Kiran", 45000);

        Employee.printCompanyInfo();
    }
}