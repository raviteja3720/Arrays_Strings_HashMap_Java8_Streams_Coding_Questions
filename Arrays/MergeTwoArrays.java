package Arrays;

import java.util.*;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7};
        int[] arr2 = {7, 1, 5, 1, 2,8, 6};

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length + arr2.length; i++) {
            if (i < arr.length) {
                result.add(arr[i]);
            }
            else  {
                result.add(arr2[i- arr.length]);
            }
        }
//        System.out.println(result);
        System.out.println(Arrays.toString(result.toArray()));


    }
}
