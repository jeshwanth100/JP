abstract class Shape {
    String color;
    Shape(String color) {
        this.color = color;
    }
    abstract double area();
    void display() {
        System.out.println("Color: " + color);
    }
}
class Circle extends Shape {
    double radius;
    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    double area() {
        return Math.PI * radius * radius;
    }
}
public class Test {
    public static void main(String[] args) {
        Shape s = new Circle("Red", 5.0);
        s.display();
        System.out.println("Area: " + s.area());
    }
}