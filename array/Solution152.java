package array;

//152. Maximum Product Subarray

public class Solution152 {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int maxProdSoFar = nums[0];
        int minProdSoFar = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= 0) {
                maxProdSoFar = Math.max(nums[i], maxProdSoFar * nums[i]);
                minProdSoFar = Math.min(nums[i], minProdSoFar * nums[i]);
            } else {
                int temp = maxProdSoFar;
                maxProdSoFar = Math.max(nums[i], minProdSoFar * nums[i]);
                minProdSoFar = Math.min(nums[i], temp * nums[i]);
            }
            ans = Math.max(ans, maxProdSoFar);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution152 sol = new Solution152();
        int[] nums = {-2,0,-1};
        int maxProd = sol.maxProduct(nums);
        System.out.println(maxProd);

        int[] nums1 = {2,3,-2,4};
        int maxProd1 = sol.maxProduct(nums1);
        System.out.println(maxProd1);
    }
}
