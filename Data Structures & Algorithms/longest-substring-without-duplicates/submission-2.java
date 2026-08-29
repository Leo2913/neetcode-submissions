class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        int maxLen = 1;
        int l = 0, r = 0;
        Set<Character> set = new HashSet<>();
        while(r < s.length()){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                r++;
                maxLen = Math.max(maxLen, r - l);
            }else{
                set.remove(s.charAt(l));
                l++;
            }
        }
        return maxLen;
    }
}
