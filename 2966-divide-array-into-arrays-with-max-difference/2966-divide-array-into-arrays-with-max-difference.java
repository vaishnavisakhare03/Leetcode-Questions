class Solution {
    public int[][] divideArray(int[] nums, int k) {
        
        Arrays.sort(nums);
        int n = nums.length;
        int[][] arr = new int[n/3][3];
        int index = 0;

        for(int i = 0 ; i < n/3 ; i++){
            int start = nums[index];
            for(int j = 0 ; j < 3 ; j++){
                arr[i][j] = nums[index];
                index++;                
                int dif = arr[i][j] - start;

                if(dif > k){
                    return new int[0][0];
                }
            }
        }

        return arr;
    }
}