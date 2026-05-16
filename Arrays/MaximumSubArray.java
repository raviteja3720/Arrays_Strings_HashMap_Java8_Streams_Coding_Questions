package Arrays;

public class MaximumSubArray {
    public static void main(String[] args) {

        int nums[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//        int sum = 0;
//        for (int i : nums) {
//            sum = 0;
//            sum = sum + i;
//        }
//        System.out.println(sum);
        System.out.println(maximumSubArray(nums));
    }

    private static int maximumSubArray(int[] nums) {
        int length = nums.length;
        int maximum = 0;
        for (int i = 0; i < length; i++) {
            int sum = 0;
            for (int j = i; j < length; j++) {
                sum = sum + nums[j];
                maximum = Math.max(maximum, sum);
            }
        }
        return maximum;
    }
}
