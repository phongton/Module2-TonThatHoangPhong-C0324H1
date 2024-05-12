package ArrayMethod;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the size of the array: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("size phải bé hơn 20!!!");
            }
        } while (size > 20);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("enter element"+(i+1)+ ": ");
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.printf("%-20s%s","element in array"," ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+"\t"   );
            
        }
        for (int j = 0; j < arr.length/2; j++) {
            int temp = arr[j];
            arr[j] = arr[size - 1 - j];
            arr[size - 1 - j ]=temp;
            
        }
        System.out.printf("\n%-20s%s","reverse array : ", "");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+"\t");
        }
    }
}
