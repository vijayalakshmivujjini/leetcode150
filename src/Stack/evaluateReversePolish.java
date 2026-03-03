class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        for(String t:tokens){
            if(!t.equals("+") &&!t.equals("-") && !t.equals("*") && !t.equals("/")){
                s.push(Integer.parseInt(t));
            }else{
                if(t.equals("+")){
                    s.push(s.pop()+s.pop());
                }
                if(t.equals("-")){ //operator order for subtraction and division is imp
                    int b=s.pop();
                    int a=s.pop();
                    s.push(a-b);
                }
                if(t.equals("*")){
                    s.push(s.pop()*s.pop());
                }
                if(t.equals("/")){ //operator order for subtraction and division is imp
                    int b=s.pop();
                    int a=s.pop();
                    s.push(a/b);
                }
            }
        }return s.isEmpty()?0:s.pop();

    }
}