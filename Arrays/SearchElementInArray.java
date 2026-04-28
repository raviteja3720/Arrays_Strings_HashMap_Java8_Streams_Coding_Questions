package Arrays;

public class SearchElementInArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 0, 13, 50, 8};
        int element=5;
        System.out.println(searchElementInArray(arr,element));
    }

    private static int searchElementInArray(int[] arr, int target) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }


}
