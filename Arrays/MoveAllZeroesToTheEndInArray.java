package Arrays;

import java.util.*;

public class MoveAllZeroesToTheEndInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};

        int position=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]!=0){
               arr[position++]=arr[i];
            }
        }
        System.out.println(position);  //5

        while(position< arr.length){
            arr[position++]=0;
        }
        System.out.println(Arrays.toString(arr));


        }
}
