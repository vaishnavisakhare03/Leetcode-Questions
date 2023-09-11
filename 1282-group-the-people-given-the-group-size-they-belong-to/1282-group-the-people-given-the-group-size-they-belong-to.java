class Solution {
    public List<List<Integer>> groupThePeople(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++){

            int k = nums[i];

            if(map.containsKey(k)){
                List<Integer> list = map.get(k);
                list.add(i);
                // map.put(nums[i], list);
            }else{
                List<Integer> t = new ArrayList<>();
                t.add(i);
                map.put(k, t);
            }

            move(ans, k, map);
        }

        return ans;
    }

    public static void move(List<List<Integer>> ans, int k, Map<Integer, List<Integer>> mp){
        if(mp.get(k).size() == k){
            ans.add(mp.get(k));
            mp.remove(k);
        }
    }
}