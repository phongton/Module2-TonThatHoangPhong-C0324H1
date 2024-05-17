package AnimalInterface_Edible.IterfacesCompare;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ComparableTest {
    public static void main(String[] args) {
        ComparableCircle[] comparableCircles = new ComparableCircle[3];
    comparableCircles[0] = new ComparableCircle(3.6);
    comparableCircles[1] = new ComparableCircle();
    comparableCircles[2] = new ComparableCircle(3.5,"black", false);
        System.out.println(" pre- sorted : ");
        for (ComparableCircle circle: comparableCircles){
            System.out.println(circle);
        }
        Arrays.sort(comparableCircles);
        System.out.println("after : ");
        for (ComparableCircle circle:comparableCircles){
            System.out.println(circle);
        }
    }
}
