package ForWhile;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số bạn cần kiểm tra :");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println("đây k phải số nguyên tố ");
        } else {
            int i = 2;
            boolean check = true;
            while (i < number) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;

            }
            if (check){
                System.out.println(number+" đây là số nguyên tố");
            }else {
                System.out.println(number+" k phải số nguyên tố");
            }
        }
    }
}
