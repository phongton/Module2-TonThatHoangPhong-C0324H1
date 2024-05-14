package AccessModifierStatic;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle() {
    }
    public String getColor(){
        return color;
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI*radius*radius;
    }
}
class TestCircle{
    public static void main(String[] args) {
        Circle cr = new Circle();
        System.out.println(cr.getRadius()+cr.getColor());
        System.out.println(cr.getArea());
    }
}