class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int n = nums.length;
        double max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0 ; i < n ; i++){
            sum = 0;
            boolean flag = false;
            for(int j = i ; j < k+i && i+k <= n ; j++){
                sum += nums[j];
                flag = true;
            }
            if(flag == false) sum = Integer.MIN_VALUE;
            if(sum > max){
                max = sum;
            }
        }
        
        return max/k;
    }
}