class Solution {
    public boolean hasAlternatingBits(int n) {

        String num = Integer.toBinaryString(n);

        for(int i = 0 ; i < num.length()-1 ; i++){
            if(num.charAt(i) == num.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
}