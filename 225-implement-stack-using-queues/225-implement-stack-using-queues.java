class MyStack {
    Queue<Integer> q;
    public MyStack() {
        this.q=new LinkedList<>();
    }
    
    public void push(int x) {
        q.offer(x);
    }
    
    public int pop() {
        Queue<Integer> q2=new LinkedList<>();
        while(q.size()>1){
            q2.offer(q.poll());
        }
        int x=q.poll();
        while(!q2.isEmpty()){
            q.offer(q2.poll());
        }
        return x;     
    }
    
    public int top() {
        Queue<Integer> q2=new LinkedList<>();
        while(q.size()>1){
            q2.offer(q.poll());
        }
        int x=q.poll();
        while(!q2.isEmpty()){
            q.offer(q2.poll());
        }
        int y=x;
        q.offer(x);
        return y;    
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */