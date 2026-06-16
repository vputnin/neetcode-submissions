class MyStack {
    Deque<Integer> deq;

    public MyStack() {
        deq = new ArrayDeque<>();
    }
    
    public void push(int x) {
        this.deq.addFirst(x);
    }
    
    public int pop() {
        return this.deq.removeFirst();
    }
    
    public int top() {
        return this.deq.peekFirst();
    }
    
    public boolean empty() {
        return deq.size() == 0;
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