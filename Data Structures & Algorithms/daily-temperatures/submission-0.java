class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int num = 0;
        int[] res = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++){
            for(int j = i + 1; j < temperatures.length; j++){
                if(temperatures[j] > temperatures[i]){
                    num = (j - i);
                    break;
                }
            }
            res[i] = num;
            num = 0;
        }
        return res;

    }
}
