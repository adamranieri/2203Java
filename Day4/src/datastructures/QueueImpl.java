package datastructures;

public class QueueImpl<T> implements  Queue<T>{

    private Object [] elements;
    private int position = 0;
    private int next = 0;

    public QueueImpl(){
        this.elements = new Object[10];
    }

    @Override
    public void add(T element) {
        this.elements[position] = element;
        this.position++;
    }

    @Override
    public T poll() {
        T element = (T) this.elements[next];
        next++; //
        return element;
    }
}
