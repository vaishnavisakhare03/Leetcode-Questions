class Solution {
    public int hammingDistance(int x, int y) {
        String one = Integer.toBinaryString(x);
        String two = Integer.toBinaryString(y);

        int i = one.length() - 1;
        int j = two.length() - 1;
        int count = 0;

        while(i >= 0 && j >= 0){
            count += one.charAt(i)^two.charAt(j);
            i--;
            j--;
        }

        while(i >= 0){
            if(one.charAt(i) == '1'){
                count++;
            }
            i--;
        }

        while(j >= 0){            
            if(two.charAt(j) == '1'){
                count++;
            }
            j--;
        }

        return count;
    }
}