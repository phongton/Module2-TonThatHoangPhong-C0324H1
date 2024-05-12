package ArrayMethod;

import java.util.Scanner;

public class StudentPass {
    public static void main(String[] args) {
        int size;
        double[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số lượng phần tử cần kiểm tra :");
        size = scanner.nextInt();
        array = new double[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println(" nhập giá trị của phần tử " + (i+1) + " : " );
            array[i] = scanner.nextDouble();
        }
        int count = 0 ;
        System.out.println("danh sách sau khi nhập : ");
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
            if(array[i]>=5 && array[i]<=10){
                count ++;
            }
        }
        System.out.println("có "+count+ " người pass");

    }
}
