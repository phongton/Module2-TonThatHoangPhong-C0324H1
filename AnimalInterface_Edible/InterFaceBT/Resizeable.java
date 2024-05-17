package AnimalInterface_Edible.InterFaceBT;

import InhertancePolymophism.baithCircle.Circle;

import java.util.Random;

public interface Resizeable {
    void resize(double percent);
    Random rand = new Random();

}
class Test{
    public static void main(String[] args) {
        Circle2 circle2 = new Circle2();
        System.out.println(circle2);
        Random random = new Random();
        Circle2 circles2 = new Circle2(random.nextInt(100));
        System.out.println(circles2);

    }
}