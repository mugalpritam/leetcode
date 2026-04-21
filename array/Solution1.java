package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (seen.containsKey(complement)) {
                return new int[] { seen.get(complement), i };
            }
            seen.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = sol.twoSum(nums, target);
        System.out.print(Arrays.toString(result));
    }
}
