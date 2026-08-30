class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length())   return false;
        Map<Character, Integer> map = new HashMap<>();
        int i = 0, j = s1.length() - 1;
        for(int m = 0; m < s1.length(); m++){
            map.put(s1.charAt(m), map.getOrDefault(s1.charAt(m), 0) + 1);
        }
        while(j < s2.length()){
            Map<Character, Integer> copy = new HashMap<>(map);
            for(int n = i; n <= j; n++){
                if(!copy.containsKey(s2.charAt(n))){
                    break;
                }
                copy.put(s2.charAt(n), copy.get(s2.charAt(n)) - 1);
            }
            if(isAllZeros(copy)){
                return true;
            }
            i++;
            j++;
        }
        return false;
    }

    public boolean isAllZeros(Map<Character, Integer> map){
        for(int value : map.values()){
            if(value != 0){
                return false;
            }
        }
        return true;
    }
}
