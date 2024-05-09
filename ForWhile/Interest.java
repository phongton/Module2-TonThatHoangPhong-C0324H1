package ForWhile;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money ;
        int month ;
        double interest ;
        System.out.println("nhập số tiền : ");
        money = scanner.nextDouble();
        System.out.println("nhập số tháng  : ");
        month = scanner.nextInt();
        System.out.println("tỉ lệ lãi 1 năm :  ");
        interest = scanner.nextDouble();
        double totalIterest = 0;
        for (int i = 0; i < month; i++) {
            totalIterest += money * (interest / 100) / 12 * month;

        }
        System.out.println("tien lai la :" + totalIterest);
    }
}
