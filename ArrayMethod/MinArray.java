package ArrayMethod;

public class MinArray {
    public int minArray(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }

        }
        return index;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        MinArray array = new MinArray();
        int index = array.minArray(arr);
        System.out.println("the small element in the array is: " + arr[index]);

    }
}
