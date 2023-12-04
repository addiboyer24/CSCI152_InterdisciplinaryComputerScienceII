import java.util.Iterator;

public class IntegerStack implements Iterable<Integer>{
    // Instance variables.
    private int n;
    private Integer[] items;

    private final int defaultCapacity = 2;

    public IntegerStack(){
        this.n = 0;
        this.items = new Integer[defaultCapacity];
    }

    // Constructor(s).
    public IntegerStack(int capacity){
        this.n = 0;
        this.items = new Integer[capacity];
    }

    // Instance methods.
    public boolean isEmpty(){
        return this.n == 0;
    }

    public void push(Integer value){
        this.items[n++] = value;
    }

    public Integer pop(){
        return this.items[--n];
    }

    public Integer peek(){
        return this.items[n-1];
    }

    public int size(){
        return n;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        IntegerStack myStack = new IntegerStack(n);
        myStack.push(10); // Autoboxing.
        myStack.push(20);
        myStack.push(30);
        int value = myStack.peek(); // Unboxing.
        for (Integer item : myStack){
            StdOut.println(item);
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Integer>{

        private int i = n-1;
        @Override
        public boolean hasNext() {
            return i >= 0;
        }

        @Override
        public Integer next() {
            return items[i--];
        }
    }
}