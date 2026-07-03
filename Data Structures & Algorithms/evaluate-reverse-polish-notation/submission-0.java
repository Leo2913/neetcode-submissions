class Solution {
    public int evalRPN(String[] tokens) {
        int operand_1, operand_2;
        Set<String> set = new HashSet<>();
        set.add("+");
        set.add("-");
        set.add("*");
        set.add("/");
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens){
            if(set.contains(token)){
                operand_2 = stack.pop();
                operand_1 = stack.pop();
                int ans;
                if(token.equals("+")){
                    ans = operand_1 + operand_2;
                }else if(token.equals("-")){
                    ans = operand_1 - operand_2;
                }else if(token.equals("*")){
                    ans = operand_1 * operand_2;
                }else{
                    ans = operand_1 / operand_2;
                }
                stack.push(ans);
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
