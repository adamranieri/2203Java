package datastructures;

// Stack = LIFO Last In First Out
// Opposite Queue. The most recently added element is the first one retrieved


public interface Stack<T> {

    void add(T element);
    T pop();// retrieves last element added and removes it from the stack
}
