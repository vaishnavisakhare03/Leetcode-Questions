class Solution {
    public int minFlips(int a, int b, int c) {

        int count = 0;

        String one = Integer.toBinaryString(a);
        String two = Integer.toBinaryString(b);
        String three = Integer.toBinaryString(c);

        int i = one.length()-1;
        int j = two.length()-1;
        int k = three.length()-1;

        while(i >= 0 && j >= 0 && k >= 0){

            int a1 = Character.getNumericValue(one.charAt(i));
            int b1 = Character.getNumericValue(two.charAt(j));
            int c1 = Character.getNumericValue(three.charAt(k));

            int pro = a1 | b1;
            if(pro == 0 && c1 == 1){
                count++;
            }else if(a1 == 1 && b1 == 1 && c1 == 0){
                count += 2;
            }else if((a1 == 1 || b1 == 1) && c1 == 0){
                count++;
            }
            i--;
            j--;
            k--;
        }

        while(i >= 0 && k >= 0){
            int a1 = Character.getNumericValue(one.charAt(i));
            int c1 = Character.getNumericValue(three.charAt(k));

            if(a1 != c1){
                count++;
            }
            i--;
            k--;
        }

        while(j >= 0 && k >= 0){
            int b1 = Character.getNumericValue(two.charAt(j));
            int c1 = Character.getNumericValue(three.charAt(k));

            if(b1 != c1){
                count++;
            }
            j--;
            k--;
        }

        while(i >= 0 && j >= 0){
            int a1 = Character.getNumericValue(one.charAt(i));
            int b1 = Character.getNumericValue(two.charAt(j));

            if(a1 == 1 && b1 == 1){
                count+=2;
            }else if(a1 != 0 || b1 != 0){
                count++;
            }
            i--;
            j--;
        }

        while(i >= 0){
            int a1 = Character.getNumericValue(one.charAt(i));
            if(a1 != 0){
                count++;
            }
            i--;
        }

        while(j >= 0){
            int b1 = Character.getNumericValue(two.charAt(j));
            if(b1 != 0){
                count++;
            }
            j--;
        }

        while(k >= 0){
            int c1 = Character.getNumericValue(three.charAt(k));
            if(c1 != 0){
                count++;
            }
            k--;
        }

        return count;
    }
}