class Employee {
    String name;
    String jobTitle;
    double salary;

   
    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

   
    public double calculateAnnualSalary() {
        return salary * 12; 
    }

    public void increaseSalary(double percentage) {
        double increaseAmount = salary * (percentage / 100);
        salary += increaseAmount;
        System.out.printf("\nSalary increased by %.2f%%. New salary: %.2f\n", percentage, salary);
    }

    public void printEmployeeDetails() {
        System.out.println("\nEmployee name: " + name);
        System.out.println("Job title: " + jobTitle);
        System.out.printf("Salary: %.2f\n", salary);
    }

}

public class Day11_Q3 {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee("Jack ", "Software Engineer", 50000);

        
        emp1.printEmployeeDetails();

        
        double annualSalary = emp1.calculateAnnualSalary();
        System.out.printf("Annual salary: %.2f\n", annualSalary);

        
        emp1.increaseSalary(10);

        emp1.printEmployeeDetails();
    }
}