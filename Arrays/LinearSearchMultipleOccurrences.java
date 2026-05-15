package Arrays;

import java.util.*;

public class LinearSearchMultipleOccurrences {
    public static void main(String[] args) {
        int[] arr={2,4,2,5,2};
        int target=2;
        List<Integer> targetArray = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                targetArray.add(i);
            }
        }
        System.out.println(targetArray);
    }
}
