class MinStack {
    public Stack<Integer> s;

    public MinStack() {
        s = new Stack<>();
    }
    
    public void push(int val) {
        s.add(val);
    }
    
    public void pop() {
        s.pop();
    }
    
    public int top() {
        if(s.isEmpty()){
            return -1;
        }
        return s.peek();
    }
    
    public int getMin() {
        int minVal = Integer.MAX_VALUE;
        for(Integer num:s){
            if(num<minVal){
                minVal = num;
            }
        }
        return minVal;
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