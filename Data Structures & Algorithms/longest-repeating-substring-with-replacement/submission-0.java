class Solution {
    public int characterReplacement(String s, int k) {
        if(s.length() == 0) return 0;
        int maxLen = 0;
        int[] counts = new int[26];
        int l = 0, r = 0, maxCount = 0;
        while(r < s.length()){
            maxCount = Math.max(maxCount, ++counts[s.charAt(r) - 'A']);
            while(r - l + 1 - maxCount > k){
                counts[s.charAt(l) - 'A']--;
                l++;
            }
            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }
        return maxLen;
    }
}
