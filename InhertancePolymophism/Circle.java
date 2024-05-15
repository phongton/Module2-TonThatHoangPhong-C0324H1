package InhertancePolymophism;

public class Circle extends Shape {
    private double radius = 1.0;
    public Circle() {}
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color,boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;

    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString() {
        return "a circle with radius " + getRadius()+"which a subclass of "+ super.toString();
    }



}
class CircleTest{
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.toString());
        circle = new Circle(3.5);
        System.out.println(circle.toString());
        circle = new Circle(3.5,"blue",false);
        System.out.println(circle.toString());
    }
}
