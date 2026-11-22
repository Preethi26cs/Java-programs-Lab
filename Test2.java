

class Point {
    int x, y;

    // Parameterized constructor
    Point(int px, int py) {
        x = px;
        y = py;
    }

    // Copy constructor
    Point(Point src) {
        x = src.x;
        y = src.y;
    }
}

public class Test2 {
    public static void main(String[] args) {
        Point P1 = new Point(3, 4);
        Point P2 = new Point(P1);

        System.out.println(P2.x + "," + P2.y);
        P2.x = 10;
        System.out.println("P1.x = " + P1.x);
        System.out.println("P2.x = " + P2.x);
    }
}

