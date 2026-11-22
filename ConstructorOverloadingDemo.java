
class Box {
    double width, height, depth;

    Box() {
        width = 1.0;
        height = 1.0;
        depth = 1.0;
    }

    Box(double side) {
        width = side;
        height = side;
        depth = side;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double getVolume() {
        return width * height * depth;
    }
}

public class ConstructorOverloadingDemo {
    public static void main(String[] arg) {
        Box box1 = new Box();
        Box box2 = new Box(5.0);
        Box box3 = new Box(2.0, 3.0, 4.0);

        // Print the result
        System.out.println("Volume of Box 1 : " + box1.getVolume());
        System.out.println("Volume of Box 2 : " + box2.getVolume());
        System.out.println("Volume of Box 3 : " + box3.getVolume());
    }
}

