package ArrayMethod;

import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so can chen : ");
        int value = scanner.nextInt();
        System.out.println("bạn muốn chèn vào vị tr nào");
        int index = scanner.nextInt();
        if (index <= -1 || index >= array.length - 1) {
            System.out.println("không chèn đc phần tử vào mản ");
        } else {
            int[] newArray = new int[array.length + 1];
            int in = 0;
            for (int i = 0; i < newArray.length; i++) {
                if (i == index) {
                    newArray[i] = value;
                } else {
                    newArray[i] = array[in++];
                }
            }

            System.out.println("mang sau khi chèn");
            for (int i = 0; i < newArray.length; i++) {
                System.out.println(newArray[i] + "");

            }
        }
    }
}
