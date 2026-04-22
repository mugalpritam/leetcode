package array;

public class Solution303 {
    private int[] nums;

    public Solution303(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int[] prefix = new int[nums.length+1];
        for(int i = 0; i < nums.length; i++) {
            prefix[i+1] = prefix[i] + nums[i];
        }
        return prefix[right+1] - prefix[left];
    }
    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        Solution303 sol = new Solution303(nums);
        int sum = sol.sumRange(0,2);
        System.out.println(sum);
    }
}
