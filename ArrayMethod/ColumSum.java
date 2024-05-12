package ArrayMethod;

import java.util.Scanner;

public class ColumSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số hàng và số cột của mảng
        System.out.print("Nhập số hàng của mảng: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        int columns = scanner.nextInt();

        // Khởi tạo mảng hai chiều với kích thước đã nhập
        double[][] array = new double[rows][columns];

        // Nhập các phần tử của mảng từ người dùng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Nhập phần tử ở hàng " + (i + 1) + ", cột " + (j + 1) + ": ");
                array[i][j] = scanner.nextDouble();
            }
        }

        // Nhập thứ tự của cột cần tính tổng
        System.out.print("Nhập thứ tự của cột cần tính tổng (tính từ 0): ");
        int columnIndex = scanner.nextInt();
        columnIndex--;

        // Tính tổng các phần tử của cột
        double columnSum = calculateColumnSum(array, columnIndex);

        // Hiển thị kết quả
        System.out.println("Tổng của các phần tử ở cột " + (columnIndex+1) + " là: " + columnSum);

        scanner.close();
    }

    // Phương thức để tính tổng của một cột trong mảng hai chiều
    public static double calculateColumnSum(double[][] array, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < array.length    ; i++) {
            if (columnIndex >= 0 && columnIndex < array[i].length) {
                sum += array[i][columnIndex];
            } else {
                System.out.println("Thứ tự của cột không hợp lệ!");
                return 0; // Trả về 0 nếu cột không hợp lệ
            }
        }
        return sum;
    }
}

