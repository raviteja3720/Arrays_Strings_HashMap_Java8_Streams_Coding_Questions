package Arrays;

public class InsertElementAtSpecificPositionInArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6};
        int element=4;
        int positionIndex=3;
        for(int i= arr.length;i>positionIndex;i--){
            arr[i]=arr[i-1];

        }
    }
}
