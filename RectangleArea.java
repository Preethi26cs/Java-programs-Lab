
class Area_Rectangle {
    double length;
    double breadth;

    double area() {
        double res;
        res = length * breadth;
        return res;
    }
}

public class RectangleArea {
    public static void main(String[] args) {
        Area_Rectangle arect1 = new Area_Rectangle();

        arect1.length = 20.9;
        arect1.breadth = 40.8;
        double area_res = arect1.area();

        System.out.println("Result is " + area_res);
    }
}

