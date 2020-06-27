//有效的括号
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char c: s.toCharArray()){
            if(c=='(')
				stack.push(')');
            else if(c=='[')
                stack.push(']');
            else if(c=='{')
                stack.push('}');
            else if(stack.isEmpty()||c!=stack.pop())
                return false;
        }
        return stack.isEmpty();
    }
}


//青蛙跳台阶问题
class Solution {
    public int numWays(int n) {
        int a = 1, b = 1, sum;
        for(int i = 0; i < n; i++){
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}