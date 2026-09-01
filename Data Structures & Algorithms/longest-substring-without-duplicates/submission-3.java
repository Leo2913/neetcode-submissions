class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        int l = 0, r = 0;
        int maxLen = 0;
        Set<Character> set = new HashSet<>();
        while(r < s.length()){
            char ch = s.charAt(r);
            if(!set.contains(ch)){
                set.add(ch);
                maxLen = Math.max(maxLen, r - l + 1);
                r++;
            }else{
                set.remove(s.charAt(l));
                l++;
            }

        }
        return maxLen;
    }
}