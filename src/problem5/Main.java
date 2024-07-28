package problem5;

// Main class to test the Employee hierarchy
public class Main {
    public static void main(String[] args) {
        // Create a Manager object
        Employee manager = new Manager("Mashrafi", 6700000, 76440);

        // Create a Programmer object
        Employee programmer = new Programmer("Sakiba", 435555, 4, 100);  // Fix: include the hourly rate

        // Display the manager's information
        manager.displayInfo();
        System.out.println("----------------------");

        // Display the programmer's information
        programmer.displayInfo();
    }
}
