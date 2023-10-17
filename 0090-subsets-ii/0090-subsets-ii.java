class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        int combo = 1 << nums.length;
        for(int i = 0 ; i < combo ; i++){
            List<Integer> l = new ArrayList<>();
            for(int j = 0 ; j < nums.length ; j++){
                if ((i & (1 << j)) != 0) {
                    l.add(nums[j]);
                }
            }
            Collections.sort(l);
            if(!list.contains(l)){
                list.add(l);
            }
        }
        return list;
    }
}