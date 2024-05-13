package OOPjava;

import java.util.Scanner;

public class MainRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the width : ");
        double width = sc.nextDouble();
        System.out.println("enter the height: ");
        double height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Your Rectangle " + rectangle.toString());
        System.out.println("Perimeter is " + rectangle.getPerimeter());
        System.out.println("Area is "+ rectangle.getArea());
    }
}
