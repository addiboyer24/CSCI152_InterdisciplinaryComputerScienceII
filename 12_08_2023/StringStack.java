public class StringStack {
    private String[] items;
    private int n;

    public StringStack(int capacity){
        this.items = new String[capacity];
        this.n = 0;
    }

    public boolean isEmpty(){
        return this.n == 0;
    }
    public String pop(){
        return items[--this.n];
    }

    public void push(String item){
        this.items[this.n++] = item;
    }

    public int size(){
        return this.n;
    }
}