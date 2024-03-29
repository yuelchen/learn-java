class MyQueue {

    Stack<Integer> queue;
    
    /** Initialize your data structure here. */
    public MyQueue() {
        queue = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        if(queue.empty()) {
            queue.push(x);
        } else {
            Stack<Integer> temp = new Stack<Integer>();
            temp.push(x);
            
            Iterator iterator = queue.iterator();
            while(iterator.hasNext()) {
                int value = (int) iterator.next();
                temp.push(value);
            }
            
            queue = temp;
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return queue.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        return queue.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return queue.empty();
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
