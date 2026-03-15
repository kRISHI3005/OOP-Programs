class Employee {
    void displayDetails() {
        System.out.println("Employee Name: Rahul");
        System.out.println("Department: IT");
    }
}

class Manager extends Employee {
    void displayDetails() {
        System.out.println("Manager Name: Rahul");
        System.out.println("Department: IT");
        System.out.println("Team Size: 8");
        System.out.println("Project Name: AI Automation");
    }
}

public class Employee2 {
    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();

        e.displayDetails();
        m.displayDetails();
    }
}