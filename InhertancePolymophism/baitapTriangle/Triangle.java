package InhertancePolymophism.baitapTriangle;

import InhertancePolymophism.baithCircle.Shape;

import java.util.Scanner;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    public Triangle(){}
    public Triangle(double side1, double side2 , double side3,String color){
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
    public double getArea(){
        return Math.sqrt(getTriangle2()*(getTriangle2()-side1)*(getTriangle2()-side2)*(getTriangle2()-side3));

    }
    public double getPerimeter(){
        return side1+side2+side3;

    }
    public double getTriangle2(){
        return (side1+side2+side3)/2;
    }
    public String toString(){
        return "dien tich tam giac là : "+ getArea() + " chu vi tam giaác là : " + getPerimeter() + super.toString();

    }
}
class Test{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập cạnh a : ");
            double a = scanner.nextDouble();
        System.out.print("nhập canh b : ");
            double b = scanner.nextDouble();
        System.out.print("nhap canh c : ");
            double c = scanner.nextDouble();
        System.out.print("nhap mau sac của tam giác : ");
            String color = scanner.next();


            Triangle triangle = new Triangle(a,b,c,color);
        triangle.setColor(color);
        System.out.println("màu sắc = " + triangle.getColor());
        System.out.println("chu vi của tam giác = " + triangle.getPerimeter());
        System.out.println("diện tích của tam giác = " + triangle.getArea());
        System.out.println(triangle);
    }
}
