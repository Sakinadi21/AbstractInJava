package problem5;

// Abstract class Employee serves as a base class for different types of employees.
abstract class Employee {
    protected String name;  // Employee's name
    protected double baseSalary;  // Employee's base salary

    // Constructor to initialize the name and base salary of the employee
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Abstract method to calculate salary, to be implemented by subclasses
    public abstract double calculateSalary();

    // Abstract method to display employee information, to be implemented by subclasses
    public abstract void displayInfo();
}

// Manager class that extends Employee
class Manager extends Employee {
    private double bonus;  // Manager's bonus

    // Constructor to initialize the name, base salary, and bonus of the manager
    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    // Method to calculate the total salary of the manager
    public double calculateSalary() {
        return baseSalary + bonus;  // Fix: add the bonus to the base salary
    }

    // Method to display the manager's information
    public void displayInfo() {
        System.out.println("Manager Name: " + name);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: $" + calculateSalary());
    }
}

// Programmer class that extends Employee
class Programmer extends Employee {
    private int overtimeHours;  // Number of overtime hours worked by the programmer
    private double hourlyRate;  // Hourly rate for overtime

    // Constructor to initialize the name, base salary, overtime hours, and hourly rate of the programmer
    public Programmer(String name, double baseSalary, int overtimeHours, double hourlyRate) {
        super(name, baseSalary);
        this.overtimeHours = overtimeHours;
        this.hourlyRate = hourlyRate;
    }

    // Method to calculate the total salary of the programmer
    public double calculateSalary() {
        return baseSalary + (overtimeHours * hourlyRate);  // Fix: add the overtime pay to the base salary
    }

    // Method to display the programmer's information
    public void displayInfo() {
        System.out.println("Programmer Name: " + name);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Overtime Hours: " + overtimeHours);
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Total Salary: $" + calculateSalary());
    }
}

