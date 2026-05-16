package Arrays;

import java.util.Arrays;

public class ReverseArrayWithoutUsingAnotherArray {
    public static void main(String[] args) {
        int[] arr = {10,7, 20, 5, 0, 13, 8};

        int left=0;
        int right=arr.length-1;
         while(left<right){
             int temp=arr[left];
             arr[left]=arr[right];
             arr[right]=temp;
             left++;
             right--;
         }
        System.out.println(Arrays.toString(arr));

    }
}
