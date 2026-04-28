package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DuplicatesElementsInArrayUsingHashMap {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1, 2, 4, 1, 5, 2, 8, 5};
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int k : map.keySet()) {
            if (map.get(k) > 1) {
                duplicates.add(k);
            }
        }

        System.out.println(duplicates);

    }

}
