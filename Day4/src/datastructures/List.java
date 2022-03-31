package datastructures;

// 1. should be able to add to it
// 2. elements in the list are indexed based on insertion 1st element is 0, 2nd element is 1 etc...
// 3. Does allow for duplicates in the list
// 4. Lists allow you get an any element via the index

public interface List<T> {

    void add(T element);

    T get(int index);

    int size();


}
