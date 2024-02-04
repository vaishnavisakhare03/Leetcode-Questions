class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int total_gas = 0;
        int total_cost = 0;

        for(int i : gas){
            total_gas += i;
        }

        for(int i : cost){
            total_cost += i;
        }

        if(total_gas < total_cost) return -1;

        int start = 0, current = 0;

        for(int i = 0 ; i < gas.length ; i++){
            current += gas[i] - cost[i];
            if(current < 0){
                start = i + 1;
                current = 0;
            }
        }
        return start;
    }
}

