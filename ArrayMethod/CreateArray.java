package ArrayMethod;

import java.util.Scanner;

public class CreateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập độ dài của mảng 1 :");
        int len1 = scanner.nextInt();
        int[] arr = new int[len1];
        System.out.println("nhập các phần tử của mảng thứ 1");
        for (int i = 0; i < len1; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("nhập độ dài của mảng 2 : ");
        int len2 = scanner.nextInt();
        int[] arr1 = new  int[len2];
        System.out.println("nhập các phần tử của mảng 2 : ");
        for (int i = 0; i < len2; i++) {
            arr1[i] = scanner.nextInt();
        }
        int[]arr3 = new int[len1+len2];
        {
            int i = 0;
            while (i < len1) {
                arr3[i]= arr[i];
                i++;
            }
        }
        int i = 0;
        while (i < len2) {
            arr3[i+len1]= arr1[i];
            i++;
        }
        System.out.println("mảng sau khi gộp : ");
        for (int j : arr3) {
            System.out.println(j + " ");

        }
    }
}
