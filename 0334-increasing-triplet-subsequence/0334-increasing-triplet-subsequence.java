class Solution {
    public boolean increasingTriplet(int[] nums) {
                
        int small = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;

        for(int i = 0 ; i < nums.length ; i++){
            if(small >= nums[i]){
                small = nums[i];
            }else if(mid >= nums[i]){
                mid = nums[i];
            }else{
                return true;
            }
            
        }
        return false;
    }
}