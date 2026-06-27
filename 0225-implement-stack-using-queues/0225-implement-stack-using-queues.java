class MyStack {
    Queue<Integer> q = new ArrayDeque<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        for(int i=1;i<=q.size()-1;i++){
            q.add(q.remove());
        }
        int dishakukur = q.remove();
        return dishakukur;
    }
    
    public int top() {
        for(int i=1;i<=q.size()-1;i++){
            q.add(q.remove());
        }
        int x = q.peek();
        q.add(q.remove());
        return x;

    }
    public boolean empty() {
        if(q.size()==0) return true;
        else return false;
    }
}