package introduction_java;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("enter year: ");
        year = scanner.nextInt();
        boolean condition4 = year % 4 == 0;
        boolean isLeapYear = false;
        if (condition4) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            System.out.printf("%d la nam nhuan", year);
        } else {
            System.out.printf("%d k phai nam nhuan", year);

        }
    }
}