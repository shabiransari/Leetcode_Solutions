class MyQueue {
    Stack<Integer> s;
    public MyQueue() {
        s=new Stack<>();
    }
    
    public void push(int x) {
        s.push(x);
    }
    
    public int pop() {
        Stack<Integer> s1=new Stack<>();
        while(!s.isEmpty()){
            s1.push(s.pop());
        }
        int x=s1.pop();
        while(!s1.isEmpty()){
            s.push(s1.pop());
        }
        return x;
    }
    
    public int peek() {
        Stack<Integer> s1=new Stack<>();
        while(!s.isEmpty()){
            s1.push(s.pop());
        }
        int x=s1.peek();
        while(!s1.isEmpty()){
            s.push(s1.pop());
        }
        return x;
        
    }
    
    public boolean empty() {
        return s.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */