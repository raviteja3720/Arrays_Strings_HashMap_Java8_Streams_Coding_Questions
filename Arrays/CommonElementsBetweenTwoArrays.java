package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

//intersection of two arrays
public class CommonElementsBetweenTwoArrays {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 6, 7};
        int[] arr2 = {7, 1, 4, 5, 3, 1, 6};
        List<Integer> result=new ArrayList<>();
        for (int i = 0; i < arr.length;i++) {
            for (int j = 0; j < arr2.length;j++){
                if(arr[i]==arr2[j]){
                    result.add(arr[i]);
                }
            }
        }
        System.out.println(result);

    }
}
