class Solution {
    public String customSortString(String order, String s) {

        char[] arr = order.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        String ans = "";

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println(map);

        for(int i = 0 ; i < arr.length ; i++){
            if(map.containsKey(arr[i])){
                ans = add(ans, arr[i], map.get(arr[i]));
                map.remove(arr[i]);
            }
        }

        for(Map.Entry<Character, Integer> e : map.entrySet()){
            ans = add(ans, e.getKey(), e.getValue());
        } 

        return ans;
    }

    public static String add(String ans, char c, int count){
        while(count > 0){
            ans += c;
            count--;
        }
        return ans;
    } 
}