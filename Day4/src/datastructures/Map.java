package datastructures;

// 1. Data is stored as Key Value pairs


public interface Map<K,V> {

    void put(K key, V value);
    V get(K key);
}
