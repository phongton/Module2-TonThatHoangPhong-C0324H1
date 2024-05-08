package introduction_java;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        double VND = 23000;
        double USD ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số tiền cần đổi :  ");
        USD = scanner.nextDouble();

        double change = USD * VND;
        System.out.println("Giá tiền VND : "+change + "VND");
    }
}
