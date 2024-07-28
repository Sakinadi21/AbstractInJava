package problem2;

// Main class to test the shapes
public class Main {
    public static void main(String[] args) {
        double r = 4.0; // Radius for the circle
        Circle circle = new Circle(r); // Create a Circle object with radius r

        double ts1 = 3.0, ts2 = 4.0, ts3 = 5.0; // Sides for the triangle
        Triangle triangle = new Triangle(ts1, ts2, ts3); // Create a Triangle object with sides ts1, ts2, ts3

        // Output the radius of the circle
        System.out.println("Radius of the Circle: " + r);

        // Output the area and perimeter of the circle
        System.out.println("Area of the Circle: " + circle.calculateArea());
        System.out.println("Perimeter of the Circle: " + circle.calculatePerimeter());

        // Output the sides of the triangle
        System.out.println("\nSides of the Triangle: " + ts1 + ", " + ts2 + ", " + ts3);

        // Output the area and perimeter of the triangle
        System.out.println("Area of the Triangle: " + triangle.calculateArea());
        System.out.println("Perimeter of the Triangle: " + triangle.calculatePerimeter());
    }
}
