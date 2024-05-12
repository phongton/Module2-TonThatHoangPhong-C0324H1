package ArrayMethod;

import java.util.Scanner;

public class MinArray2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập phần tử có trong mảng : ");
        int[] array;
        int size;
        size = scanner.nextInt();
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhập giá trị của từng phần tử : "+  (i+1) );
            array[i] = scanner.nextInt();

        }
        System.out.println("các phần tử có trong mảng l : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
        int min = array[0] ;
        int index = 1 ;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min){
                min = array[i];
                index = i + 1 ;
            }
        }
        System.out.println("số nhỏ nhất trong mảng là : " + min + "tại vị trí : "+ index);



    }

}
