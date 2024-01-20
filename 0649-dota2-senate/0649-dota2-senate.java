class Solution {
    public String predictPartyVictory(String senate) {
        
        int rCount = 0, dCount = 0, rban = 0, dban = 0;
        int n = senate.length();

        Queue<Character> q = new LinkedList<>();

        for(char c : senate.toCharArray()){
            if(c == 'D') dCount++;
            else rCount++;
            q.offer(c);
        }

        while(dCount > 0 && rCount > 0){
            char curr = q.poll();

            if(curr == 'D'){
                if(dban > 0){
                    dban--;
                    dCount--;
                }else{
                    rban++;
                    q.offer(curr);
                }
            }else{
                if(rban > 0){
                    rban--;
                    rCount--;
                }else{
                    dban++;
                    q.offer(curr);
                }
            }
        }

        return rCount > 0 ? "Radiant" : "Dire";
    }
}