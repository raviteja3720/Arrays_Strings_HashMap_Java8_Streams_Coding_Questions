package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7};
        int[] arr2 = {7, 1, 5, 1, 3, 6};

        HashSet<Integer> union = new LinkedHashSet<>();
        for (int i : arr) {
            union.add(i);
        }
        for (int j : arr2) {
            union.add(j);
        }

        System.out.println(union);
    }
}
