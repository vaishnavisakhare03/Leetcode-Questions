class Solution {
    public int pivotInteger(int n) {
        
        int i = 1;

        for(int x = 1 ; x <= n ; x++){
            int sum1 = 0;
            i = 1;
            while(i <= x){
                sum1 += i;
                i++;
            }
            int sum2 = 0;
            int pivot = x;
            while(pivot <= n){
                sum2 += pivot;
                pivot++;
            }

            if(sum1 == sum2) return x;
        }

        return -1;
    }
}