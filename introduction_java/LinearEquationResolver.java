package introduction_java;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("giải phương trình bậc nhất !!");
        System.out.println("cho phương trình 'a* x + b',nhập các số vào để tìm x :  ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a : ");
        double a = scanner.nextDouble();
        System.out.println("b : ");
        double b = scanner.nextDouble();
        System.out.println("c : ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double x = (c - b) / a;
            System.out.println(" Giá tri của x là : " + x);

        } else {
            if (b == c) {
                System.out.println("x phù hợp với mọi giá trị.");
            } else {
                System.out.println("k có keets quả");
            }
        }
    }
}
