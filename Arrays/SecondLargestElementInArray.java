package Arrays;

import java.util.Arrays;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 0, 130, 50, 80};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("First largest number: " + arr[arr.length - 1]);
        System.out.println("Second largest number: " + arr[arr.length - 2]);


    }
}
