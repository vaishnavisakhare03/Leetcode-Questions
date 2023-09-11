class Solution {
    public boolean checkOnesSegment(String s) {
        
        char one = '1';
        int i = 1;
        boolean flag = true;

        while(i < s.length() && s.charAt(i) == '1'){
            flag = true;
            i++;
        }

        while(i < s.length()){
            if(s.charAt(i) == '1'){
                flag = false;
            }
            i++;
        }

        return flag;
    }
}