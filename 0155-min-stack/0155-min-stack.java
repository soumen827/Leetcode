class MinStack {
    Stack<Long> st = new Stack<>();
    long min =-1;
    public MinStack() {
        // Constructor
    }
    
    public void push(int val) {
        long x = (long)val;
        if(st.isEmpty()){
            st.push(x);
           min = x;
        }
        else if(x>=min)
            st.push(x);
        
        else if(min>x){
            st.push(2*x-min);
            min = x;
        }
    }
    
    public void pop() {
        if(st.isEmpty()) return ;
        else if(st.peek()>=min) st.pop();
        else if(st.peek()<min){
            long old = 2*min-st.peek();
            min = old;
            st.pop();
        }
    }
    
    public int top() {
        if(st.isEmpty()) return -1;
        long q = st.peek();
        if(q>=min) return (int)(q);
        if(q<min) return (int)min;
        return 0;
    }
    
    public int getMin() {
        if(st.isEmpty()) return -1;
        return (int)min;
        
    }
}
 