package Arrays;

import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {

        int[] arr = {10, 20, 5, 0, 130, 50, 80};  //assen
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
