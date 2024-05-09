package ForWhile;

import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        System.out.println("nhập a : ");
        a = scanner.nextInt();
        System.out.println("nhập b : ");
        b = scanner.nextInt();
        a= Math.abs(a);
        b= Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("2 số này k có ước chung lớn nhất");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;

            } else {
                b = b - a;
            }

        }
        System.out.println("ước lơn nhất là : "+ a);

    }
}
