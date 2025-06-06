import java.util.Stack;

class MinStack {
    private Stack<Integer> stack=new Stack<>();
    private Stack<Integer> minStack=new Stack<>();

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        } 
    }
    
    public void pop() {
        if (!stack.isEmpty()) {
            int x=stack.pop();
            if(x==minstack.peek())
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
