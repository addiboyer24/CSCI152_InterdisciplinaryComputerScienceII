import java.util.Iterator;

public class LLIntegerStack implements Iterable<Integer>{
    private Node top;

    private int size;

    public LLIntegerStack(){
        this.top = null;
        this.size = 0;
    }

    public Integer peek(){
        return this.top.data;
    }

    // top -> n1 -> n2 -> null;
    // top -> n2 -> null;
    public Integer pop(){
        Integer value = this.top.data;
        this.top = this.top.next;
        return value;
    }

    public void push(Integer item){
        Node prevTop = this.top;
        Node newNode = new Node(item);
        this.top = newNode;
        newNode.next = prevTop;
    }

    public int size(){
        return this.size;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<Integer>{
        private Node currentTop = top;

        @Override
        public boolean hasNext() {
            return currentTop != null;
        }

        @Override
        public Integer next() {
            Integer currentValue = currentTop.data;
            currentTop = currentTop.next;
            return currentValue;
        }
    }
    private class Node{

        // top -> null; what we have.
        // top -> Node(Integer item) -> Node(Integer item) -> null;
        private Integer data;
        private Node next;

        public Node(Integer data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        LLIntegerStack myStack = new LLIntegerStack();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        for (int value : myStack){ // Unboxing or Autoboxing?
            StdOut.println(value);
        }
    }
}