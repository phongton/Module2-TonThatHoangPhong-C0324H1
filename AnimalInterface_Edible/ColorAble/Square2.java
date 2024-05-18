package AnimalInterface_Edible.ColorAble;

import InhertancePolymophism.baitapTriangle.Triangle;
import InhertancePolymophism.baithCircle.Circle;
import InhertancePolymophism.baithCircle.Rectangle;
import InhertancePolymophism.baithCircle.Shape;

public class Square2 extends Shape implements ColorAble {
    private double side ;
    public Square2(double side){
        this.side = side;
    }
    @Override
    public double getArea(){
        return side * side;
    }
    @Override
    public void howToColor(){
        System.out.println("Color all four sides");

    }
    @Override
    public String toString(){
        return super.toString();
    }

}
class Test1{
    public static void main(String[] args) {
        Shape [] shapes = new Shape[4];
        shapes[0] = new Circle(2);
        shapes[1] = new Triangle(2.0,2.0,3.0,"red");
        shapes[2] = new Square(2);
        shapes[3] = new Square2(4);
        for (Shape shape: shapes) {
            System.out.println("dien tich : " + shape.getArea());


            if (shape instanceof ColorAble) {
                ((ColorAble) shape).howToColor();

            }
        }
    }
}
