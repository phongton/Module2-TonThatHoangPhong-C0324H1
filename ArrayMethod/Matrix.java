package ArrayMethod;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số hàng của mảng :  ");
        int rows = scanner.nextInt();
        System.out.println("nhập số cột của mảng :  ");
        int colum = scanner.nextInt();
        int[][] TwoArray = new int[rows][colum];
        System.out.println("nhập các phần tử của mảng : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.println("nhập phần tử ở hang : " + (i + 1) + " cột : " + (j + 1));
                TwoArray[i][j] = scanner.nextInt();
            }

        }
        System.out.println("Mảng đã nhập:");
        for (int i = 0; i < TwoArray.length; i++) {
            for (int j = 0; j < TwoArray[i].length; j++) {
                System.out.print(TwoArray[i][j] + " ");
            }
            System.out.println();


        }
        int MaxValue = TwoArray[0][0];
        int MaxRow = 0;
        int MaxColum = 0 ;
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <colum ; j++) {
                if(TwoArray[i][j]>MaxValue){
                    MaxValue = TwoArray[i][j];
                    MaxRow = i;
                    MaxColum=j;

                }
            }
        }
        System.out.println("phần tử lớn nhất trong mangr là : " + MaxValue + "tại haàng " + (MaxRow+1)+" cột "+(MaxColum+1));


    }
}
