package datastructures;

// 1. ArrayList is backed by an array
// Arrays do dynamically resize so we need to implement that functionality
// We can HIDE (Abstraction) the implementation details
// We only care that it can do these three things

import java.util.Arrays;

public class ArrayList<T> implements List<T> {

    private Object [] elements;
    private int currentPosition;

    public ArrayList(){
        this.elements = new Object[10];// initialize an array with 10 spaces to start
        this.currentPosition = 0;
    }

    private void resize(){
        this.elements = Arrays.copyOf(this.elements, this.elements.length +10);
    }

    @Override
    public void add(T element) {
        if(currentPosition >= this.elements.length){
            this.resize();
        }
        this.elements[currentPosition] = element;
        currentPosition++;
    }

    @Override
    public T get(int index) {
        return (T) this.elements[index];
    }

    @Override
    public int size() {
        return this.currentPosition;
    }
}
