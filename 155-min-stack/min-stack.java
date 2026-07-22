class MinStack {
    Stack <Integer>  Stack;
    Stack <Integer> minStack;

    public MinStack() {
        Stack = new Stack<>();
        minStack= new Stack <>();
        
    }
    
    public void push(int val) {
        Stack.push(val);
        if(minStack.isEmpty()||val<=minStack.peek())
        minStack.push(val);
        
    }
    
    public void pop() {
        int poppedValue = Stack.pop();

        if (poppedValue == minStack.peek())
            minStack.pop();

        
    }
    
    public int top() {
        return Stack.peek();

        
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */