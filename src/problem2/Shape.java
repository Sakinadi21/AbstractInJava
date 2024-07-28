package problem2;

// Abstract class Shape, which has two abstract methods: calculateArea and calculatePerimeter
abstract class Shape {
    abstract double calculateArea(); // Abstract method to calculate area
    abstract double calculatePerimeter(); // Abstract method to calculate perimeter
}

// Circle class extending Shape
class Circle extends Shape {
    private double radius; // Private field for radius

    // Constructor for Circle
    public Circle(double radius) {
        this.radius = radius; // Assign the given radius to the instance variable
    }

    // Method to calculate area of the circle
    @Override // This annotation is optional but recommended to indicate overriding
    double calculateArea() {
        return Math.PI * radius * radius; // Area formula: πr^2
    }

    // Method to calculate perimeter of the circle
    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius; // Perimeter formula: 2πr
    }
}

// Triangle class extending Shape
class Triangle extends Shape {
    private double side1; // Private field for first side
    private double side2; // Private field for second side
    private double side3; // Private field for third side

    // Constructor for Triangle
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1; // Assign the given side1 to the instance variable
        this.side2 = side2; // Assign the given side2 to the instance variable
        this.side3 = side3; // Assign the given side3 to the instance variable
    }

    // Method to calculate area of the triangle using Heron's formula
    @Override
    double calculateArea() {
        double s = (side1 + side2 + side3) / 2; // Semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)); // Heron's formula
    }

    // Method to calculate perimeter of the triangle
    @Override
    double calculatePerimeter() {
        return side1 + side2 + side3; // Perimeter formula: sum of all sides
    }
}

