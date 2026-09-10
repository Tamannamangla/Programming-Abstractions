
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        boolean[] used = new boolean[nums.length];

        backtrack(nums, used, new ArrayList<>(), ans);

        return ans;
    }

    public void backtrack(int[] nums, boolean[] used,
                          List<Integer> current,
                          List<List<Integer>> ans) {

        // All numbers are used
        if (current.size() == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // Try every number
        for (int i = 0; i < nums.length; i++) {

            // Already used
            if (used[i]) {
                continue;
            }

            // Pick
            current.add(nums[i]);
            used[i] = true;

            // Recursion
            backtrack(nums, used, current, ans);

            // Backtrack
            used[i] = false;
            current.remove(current.size() - 1);
        }
    }
}

