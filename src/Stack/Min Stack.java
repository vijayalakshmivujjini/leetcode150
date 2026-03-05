class MinStack {
    List<Integer> l;
    List<Integer> min;


    public MinStack() {
        l=new ArrayList();
        min=new ArrayList();
    }

    public void push(int val) {
        l.add(val);
        if(min.isEmpty() || val<=min.get(min.size()-1))
            min.add(val);
    }

    public void pop() {
        if(!l.isEmpty()) {
            int top = l.remove(l.size() - 1); // remove first
            if(top == min.get(min.size() - 1))
                min.remove(min.size() - 1);
        }
    }

    public int top() {
        return l.get(l.size()-1);

    }

    public int getMin() {
        return min.get(min.size()-1);
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