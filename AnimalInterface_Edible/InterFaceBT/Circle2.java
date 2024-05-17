package AnimalInterface_Edible.InterFaceBT;

import InhertancePolymophism.baithCircle.Circle;

public class Circle2 extends Circle implements Resizeable {
    public Circle2(){};
    public Circle2(double radius) {
        super(radius);
    }

    @Override
    public void resize(double percent) {
        setRadius(getRadius()*percent);

    }
    @Override
    public String toString(){
         return "Area " + getArea() + super.toString();
    }

    public static void main(String[] args) {
        Circle2 circle2 = new Circle2();
        System.out.println(circle2.getArea());
        circle2.resize(rand.nextInt(100));
        System.out.println(circle2.getArea());
    }
}
