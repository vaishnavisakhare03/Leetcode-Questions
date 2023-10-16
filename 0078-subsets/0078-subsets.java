class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        int combinations = 1 << nums.length;

        for(int i = 0 ; i < combinations ; i++){
            List<Integer> inList = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                if ((i & (1 << j)) != 0) {
                    inList.add(nums[j]);
                }
            }
            list.add(inList);
        }

        return list;
    }
}