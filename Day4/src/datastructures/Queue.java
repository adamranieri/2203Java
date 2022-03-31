package datastructures;

// Queue = FIFO First in first out. The order in which you put elements in, is the order in which you get them back out
// Retrieving an element removes it from the Queue.
// 100% like standing in line or in a queue. First come First Serve

public interface Queue<T> {

    void add(T element);

    T poll();

}
