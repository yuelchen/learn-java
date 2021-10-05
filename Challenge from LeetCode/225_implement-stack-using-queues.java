class MyStack {

    private Queue<Integer> lifo;
    
    /** Initialize your data structure here. */
    public MyStack() {
        lifo = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        if(lifo.size() > 0) {
            Queue<Integer> temp = new LinkedList<>();
            temp.add(x);
            
            for(Integer integer : lifo) {
                temp.add(integer);
            }
            lifo = temp;
            
        } else {
            lifo.add(x);
            System.out.println("Added " + x + " to empty queue");
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return lifo.remove();
    }
    
    /** Get the top element. */
    public int top() {
        return lifo.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return lifo.size() == 0;
    }
    
    public void printOueue(Queue<Integer> queue) {
        StringBuilder sb = new StringBuilder();
        
        Queue<Integer> temp = queue;
        for(Integer integer : queue) {
            sb.append(String.format("%d ", integer));
        }
        
        System.out.println(sb.toString());
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
