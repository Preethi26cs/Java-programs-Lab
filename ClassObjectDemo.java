
// Class definition
class Rectangle {
    double length;
    double width;

    // Method to set dimensions
    void setDimensions(double l, double w) {
        length = l;
        width = w;
    }

    // Method to calculate area
    double calculateArea() {
        return length * width;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Length : " + length + ", Width : " + width);
        System.out.println("Area : " + calculateArea());
    }
}

public class ClassObjectDemo {
    public static void main(String[] args) {
        // Creating Object 1
        Rectangle rect1 = new Rectangle();
        rect1.setDimensions(10, 5);

        // Creating Object 2
        Rectangle rect2 = new Rectangle();
        rect2.setDimensions(8, 4);

        System.out.println("--- Rectangle 1 Details ---");
        rect1.displayDetails();

        System.out.println("\n--- Rectangle 2 Details ---");
        rect2.displayDetails();
    }
}
