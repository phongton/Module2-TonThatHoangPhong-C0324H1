package ForWhile;

import java.util.Scanner;

public class MenuPrint {
    public static void main(String[] args) {
        int choice = -1;

        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("menu");
            System.out.println("1. Draw triangle");
            System.out.println("2. Draw square");
            System.out.println("3. Draw rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();

        switch (choice) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 6; j++) {
                        System.out.print("*");

                    }
                    System.out.println();

                }break;
            case 2:
                for (int i = 1; i <= 6; i++) {
                    for (int j = 1; j < i; j++) {
                        System.out.print("*");

                    }
                    System.out.println();
                }break;
            case 3:
                for (int i = 7; i >1 ; i--) {
                    for (int j = 1; j < i ; j++) {
                        System.out.print("*");
                        
                    }
                    System.out.println();
                    
                }break;
            case 0:
                System.exit(0);
        }
        }
    }
}