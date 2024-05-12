package ArrayMethod;

import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        DeleteArray array = new DeleteArray();
        int index = array.deleteArray(arr);
        System.out.println("mang sau khi xoa");
        for (int i = 0; i < arr[index]; i++) {
            System.out.println(arr[i]+"");

        }


    }

    public int deleteArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhâp số bạn muốn xoá khỏi mảng : ");
        int value = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                index = i;
                break;


            }

        }
        if (index == -1) {
            System.out.println("k ton tai");
        } else {
            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i + 1];

            }
        }
        return array[index];


    }
}
