package ArrayMethod;

import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("nhập số lượng phần tử");
            size = sc.nextInt();
            if (size > 20) System.out.println(" số lượng phải nhỏ hơn 20 ");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while ( i < array.length) {
            System.out.println("nhập gias trị của từng phần tử " + (i + 1) + " : ");
            array[i] = sc.nextInt();
            i++;

        }
        System.out.println("cac phan tu co trong list là : ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] );
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if(array[j]>max){
                max = array[j];
                index = j+1;
            }

        }
        System.out.println("số lớn nhất trong mảng là : "+ max+" tại vị trí "+index);
    }
}

