class Solution {
    public boolean isValid(String s) {
        if(s.length()==1)return false;
        Stack<Character> st=new Stack<>();
        int n=s.length();
        for(int i=0; i<n; i++){
            
                if(st.isEmpty())
                st.push(s.charAt(i));
            
            else if(st.size()>0&&((st.peek()=='(' && s.charAt(i)==')') || (st.peek()=='{' && s.charAt(i)=='}') || (st.peek()=='[' && s.charAt(i)==']'))){
                st.pop();
                //if(st.isEmpty()) return true;
            }else{
                st.push(s.charAt(i));
            }
        }
       if(!st.isEmpty()) return false;
    
        return true;
    }
}