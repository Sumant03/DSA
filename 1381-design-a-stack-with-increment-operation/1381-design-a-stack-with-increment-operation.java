class CustomStack {
    int[] value;
    int[] increment;
    
    int ts;
    public CustomStack(int maxSize) {
        value=new int[maxSize];
        increment=new int[maxSize];
        ts=-1;
    }
    
    public void push(int x) {
        if(ts+1==value.length){
            return;
        }
        ts++;
        value[ts]=x;
    }
    
    public int pop() {
        if(ts==-1){
            return -1;
        }
        int val=value[ts]+increment[ts];
        int inc=increment[ts];
        value[ts]=0;
        increment[ts]=0;
        ts--;
        
        if(ts>=0)  increment[ts]+=inc;
        
        return val;
    }
    
    public void increment(int k, int val) {
        if(ts==-1){
            return;
        }
        if(k>ts+1&&ts>=0){
            increment[ts]+=val;
        }
        else{
        increment[k-1]+=val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */