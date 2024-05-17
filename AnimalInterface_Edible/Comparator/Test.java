package AnimalInterface_Edible.Comparator;

import InhertancePolymophism.baithCircle.Circle;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5,"black",false );
        System.out.println("pre : ");
        for (Circle circle : circles){
            System.out.println(circle);
        }
        Comparator comparator = new CircleComparator();
        Arrays.sort(circles,comparator);
        System.out.println("after : ");
        for (Circle circle: circles){
            System.out.println(circle);
        }
    }
}
