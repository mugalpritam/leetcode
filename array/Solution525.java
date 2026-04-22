package array;

import java.util.HashMap;
import java.util.Map;

public class Solution525 {

    public int findMaxLength(int[] nums) {
        int maxLength = 0;
        int prefixSum = 0;
        Map<Integer, Integer> prefixSumIndexMap = new HashMap<>();
        prefixSumIndexMap.put(0, -1);
        for(int i=0; i< nums.length; i++) {
            prefixSum += nums[i]==0 ? -1 : 1;
            if(prefixSumIndexMap.containsKey(prefixSum)) {
                int length = i - prefixSumIndexMap.get(prefixSum);
                maxLength = Math.max(maxLength, length);
            } else {
                prefixSumIndexMap.put(prefixSum, i);
            }
        }
        System.out.println(prefixSumIndexMap);
        return maxLength;
    }

    public static void main(String[] args) {
        Solution525 sol = new Solution525();
        int[] nums = {0,1,1,1,1,1,0,0,0};
        int length = sol.findMaxLength(nums);
        System.out.println(length);
    }
}