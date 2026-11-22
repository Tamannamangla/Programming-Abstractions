class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            // Negative number reverses max and min
            if (num < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            // Either start fresh or extend the subarray
            max = Math.max(num, max * num);
            min = Math.min(num, min * num);

            // Update the overall answer
            ans = Math.max(ans, max);
        }

        return ans;
    }
}