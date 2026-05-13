class Solution {
    public int[] productExceptSelf(int[] nums) {
        int total = 1, count = 0;
        for(int num : nums){
            if(num != 0){
                total *= num;
            }else{
                count++;
            }
        }
        if(count > 1){
            return new int[nums.length];
        }
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(count > 0){
                res[i] = (nums[i] == 0)? total : 0;
            }else{
                res[i] = (total / nums[i]);
            }
        }
        return res;
    }
}  
