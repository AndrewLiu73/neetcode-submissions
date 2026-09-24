class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++){
            int x = nums[i];
            int y = nums[i+1];
            if(y==x){
                return true;
            }
           
        }return false;
        
    }
}