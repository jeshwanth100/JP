class Rectangle {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double area() {
        return length * breadth;
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(12.5,6.0);

        System.out.println("length :" + rect.length);
        System.out.println("breadth :" + rect.breadth);
        System.out.println("Area :" + rect.area());
    }
}