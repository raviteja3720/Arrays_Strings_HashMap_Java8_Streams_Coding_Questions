package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10,7, 20, 5, 0, 13, 8};
        //
        int[] rev = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            rev[j] = arr[i];
            j++;
        }
        System.out.println(Arrays.toString(rev));

//        int k = 0;
//        for (int i = arr.length - 1; i >= 0; i--) { // {10, 20, 5, 0, 13, 8};
//            arr[k] = arr[i];
//            k++;
//        }
//        System.out.println(Arrays.toString(arr));

    }
}
