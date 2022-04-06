package dev.ranieri.utilities;

import java.util.Arrays;

public class ArrayList<T> implements List<T>{

    private Object [] elements;
    private int currentIndex;

    public ArrayList(){
        this.elements = new Object[10];
        this.currentIndex = 0;
    }

    @Override
    public void add(T element) {
        if(currentIndex <this.elements.length){
            this.elements[currentIndex] = element;
        }else{
            // resizing logic
            this.elements = Arrays.copyOf(this.elements, this.elements.length + 10);
            this.elements[currentIndex] = element;
        }
        this.currentIndex++;

    }

    @Override
    public T get(int index) {
        return (T) this.elements[index];
    }

    @Override
    public int size() {
        return this.currentIndex;
    }
}
