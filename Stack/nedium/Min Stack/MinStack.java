import java.util.ArrayList;

class MinStack {
    ArrayList<Integer> list;
    int size;
    int min;
    int min2;

    public MinStack() {
        this.list=new ArrayList<>();
        size=0;
    }
    
    public void push(int val) {
        list.add(size, val);
        size++;
    }
    
    public void pop() {
        if(size<1) return;
        list.remove(size-1);
        size--;
    }
    
    public int top() {
        if(size<1) return -1;
        int n=list.get(size-1);
        return n;
    }
    
    public int getMin() {
        if(size<0) return -1;
        int min=list.get(0);
        for (Integer integer : list) {
            if(integer<min)
                min=integer;
        }
        return min;
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