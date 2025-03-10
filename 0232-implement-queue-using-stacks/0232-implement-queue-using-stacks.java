class MyQueue {
    Stack<Integer> a;
    Stack<Integer> b;
    public MyQueue() {
        a=new Stack<>();
        b=new Stack<>();
    }
    
    public void push(int x) {
        a.push(x);
    }
    
    public int pop() {
        if(a.size()==0 && b.size()==0){
            return 0;
        }
        while(!a.isEmpty()){
            b.push(a.pop());
        }
        int d=b.pop();
        while(!b.isEmpty()){
            a.push(b.pop());
        }
        return d;
    }
    
    public int peek() {
        if(a.size()==0 && b.size()==0){
            return 0;
        }
        while(!a.isEmpty()){
            b.push(a.pop());
        }
        int d=b.peek();
        while(!b.isEmpty()){
            a.push(b.pop());
        }
        return d;
        
    }
    
    public boolean empty() {
        if(a.size()==0 && b.size()==0) return true;
        return false;
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