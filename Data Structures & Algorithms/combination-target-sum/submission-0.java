class Solution {
    private List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        backtracking(nums, target, 0, cur);
        return res;
    }

    private void backtracking(int[] nums, int target, int i, List<Integer> cur){
        if(target == 0){
            res.add(new ArrayList(cur));
            return;
        }
        if(target < 0 || i >= nums.length){
            return;
        }

        cur.add(nums[i]);
        backtracking(nums, target - nums[i], i, cur);
        cur.remove(cur.size() - 1);
        backtracking(nums, target, i + 1, cur);
    }
}
