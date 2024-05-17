package AnimalInterface_Edible.ColorAble;

import AnimalInterface_Edible.Animal.Test;
import InhertancePolymophism.baitapTriangle.Triangle;
import InhertancePolymophism.baithCircle.Circle;
import InhertancePolymophism.baithCircle.Rectangle;
import InhertancePolymophism.baithCircle.Shape;

public class Square2 extends Shape implements ColorAble {
    @Override
    public void howToColor(){
        System.out.println("Color all four sides");

    }

}
class Test1{
    public static void main(String[] args) {
        Shape [] shapes = new Shape[4];
        shapes[0] = new Circle(2);
        shapes[1] = new Triangle(2.0,2.0,3.0,"red");
        shapes[2] = new Rectangle(2.0,3.0);
        shapes[3] = new Square2();
        for (Shape shape: shapes){
            System.out.println("dien tich : "+ shape.getArea());

        }
        if (shapes instanceof ColorAble ){
            ((ColorAble) shapes).howToColor();
        }
    }
}
