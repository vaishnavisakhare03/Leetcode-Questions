class Solution {
    public int maxFrequencyElements(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int max = -1;
        int ans = 0;

        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            if(max < map.get(nums[i])){
                max = map.get(nums[i]);
            }
        }

        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() == max){
                ans += max;
            }
        }

        return ans;
    }
}