class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] counts = new int[26];
        for(char task : tasks){
            counts[task - 'A']++;
        }
        Arrays.sort(counts);
        int maxf = counts[25];
        int idle = (maxf - 1) * n;
        for(int i = 24; i >= 0; i--){
            idle -= Math.min(counts[i], maxf - 1);
        }
        return Math.max(0 , idle) + tasks.length;
    }
}
