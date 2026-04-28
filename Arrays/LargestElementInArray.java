package Arrays;

public class LargestElementInArray {
    public static void main(String[] args) {

        int[] arr = {10, 20, 5, 0, 130, 50, 80};
        System.out.println("Largest element: " + findLargest(arr));
    }

    private static int findLargest(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

//        System.out.println(max);
        return max;
    }

}
