package Arrays;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DuplicateNumbersInArray {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5,1, 3, 6};
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }

    }

}

