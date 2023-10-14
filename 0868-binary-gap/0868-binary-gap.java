class Solution {
    public int binaryGap(int n) {
        
        int prev = 0;
        int dist = 0;
        String s = Integer.toBinaryString(n);

        int in = 0;
        while(s.charAt(in) == '0'){
            in++;
        }
        
        prev = in;

        for(int i = prev + 1 ; i < s.length() ; i++){
            if(s.charAt(i) == '1' && dist < i - prev){              
                dist = i - prev;
                prev = i;
            }else if(s.charAt(i) == '1'){
                prev = i;
            }
        }

        return dist;
    }
}
