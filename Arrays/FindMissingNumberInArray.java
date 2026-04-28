package Arrays;

public class FindMissingNumberInArray {
    public static void main(String[] args) {

        int[] numbers = new int[]{1, 2, 3, 4, 6, 7};

        int total=numbers.length+1;
        int expected_sum=total*((total+1))/2;
        System.out.println(expected_sum);

        int num_sum=0;
        for(int i:numbers){
            num_sum=num_sum+i;
        }
        int missing_number=expected_sum-num_sum;
        System.out.println(missing_number);
    }
}
