class MinStack {

    class Node {
        int value;
        Node next;
        
        Node(int x) {
            value = x;
        }
    }
    
    int min = Integer.MAX_VALUE;
    Node head = null;
    
    /** initialize your data structure here. */
    public MinStack() {}
    
    public void push(int x) {
        if(head == null) {
            head = new Node(x);
            min = x;
        } else {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            
            min = min > x ? x : min;
        }
    }
    
    public void pop() {
        if(head != null) {
            if(head.value == min) {
            
                Node temp = head.next;
                min = Integer.MAX_VALUE;
                
                while(temp != null) {
                    min = temp.value < min ? temp.value : min;
                    temp = temp.next;
                }
            }
            
            head = head.next;
        }
    }
    
    public int top() {
        return head == null ? 0 : head.value;
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
