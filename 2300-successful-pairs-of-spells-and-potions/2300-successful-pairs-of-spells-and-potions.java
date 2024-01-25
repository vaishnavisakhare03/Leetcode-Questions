class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        
        int[] pairs = new int[spells.length];
        int m = potions.length;
        int n = spells.length;

        Arrays.sort(potions);
        
        for(int i = 0 ; i < n ; i++){
            int spell = spells[i];
            int low = 0;
            int high = m - 1;
            
            while(low <= high){
                int mid = low + (high - low)/2;
                long product = (long) spell*potions[mid];
                if(product >= success){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }
            
            pairs[i] = m - low;
        }

        return pairs;
    }
}
