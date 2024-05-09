package ForWhile;

import java.util.Scanner;

public class PrintPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("nhập số lượng so nguyên tố cần in ra :");

        int count = 0;
        int num = 2;
        while (count < number) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    check = false;
                    break;


                }

            }
            if (check) {
                System.out.println(num + " ");
                count++;

            }
            num++;
        }


    }
}
