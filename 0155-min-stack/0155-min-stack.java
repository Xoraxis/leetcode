class MinStack {
    private Node top;
    class Node {
        int data;
        int minVal;
        Node prev;
        
        Node(){
            
        }
        
        Node(int data, Node prev, int minVal){
            this.data = data;
            this.prev = prev;
            this.minVal = data > minVal ? minVal : data;
        }
        
    }

    public MinStack() {
        top = null;
    }
    
    public void push(int val) {
        if (top == null ) {
            top = new Node(val,null,val);
        }
        else {
            Node n = new Node(val,top, top.minVal);
            top = n;
        }
    }
    
    public void pop() {
          top = top.prev;
    }
    
    public int top() {
        return top.data;
    }
    
    public int getMin() {
        return top.minVal;
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