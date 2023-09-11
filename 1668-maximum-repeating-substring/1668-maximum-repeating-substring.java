class Solution {
    public int maxRepeating(String s, String w) {
        
        if(s.length() < w.length()) return 0;

        StringBuilder sb = new StringBuilder("");
        int count = 0;

        while(sb.length() <= s.length()){
            sb.append(w);
            if(s.contains(sb)) count++;
            else break;
        }

        return count;
    }
}

/**
/to keep track on the word
        int index = 0;
        int count = 0;

        //to iterate through the sequence
        for(int i = 0 ; i < sequence.length() ; i++){

            //check if index of word and sequence matches
            if(sequence.charAt(i) == word.charAt(index)){
                index++;
                if(index == word.length()){
                    count++;
                    index = 0;
                }
            }else{
                index = 0;
                if(sequence.charAt(i) == word.charAt(index)){
                    index++;
                    if(index == word.length()){
                        count++;
                        index = 0;
                    }
                }
            }
        }

        return count;

 */