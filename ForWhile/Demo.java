package ForWhile;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so ");
        double number = scanner.nextDouble();
        double i = 1;
        double sum= 0 ;
        while (i<=number){
            sum += 1/i;
            i++;


        }
        System.out.println(sum);
    }

}
