package datastructures;

// 1. A set can contain ONLY unique values
// 2. sets ARE not ordered by index
// Java typically uses the hashcode of an object to determine uniqueness


public interface Set<T> {

    void add(T element);

    int size();


}
