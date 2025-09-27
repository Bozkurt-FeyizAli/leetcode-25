import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import javax.swing.plaf.SliderUI;

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
        System.out.print(list.get(size-1));
    }
    
    public int top() {
        if(size<1) return -1;
        int n=list.get(size-1);
        list.remove(n);
        size--;
        return n;
    }
    
    public int getMin() {
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