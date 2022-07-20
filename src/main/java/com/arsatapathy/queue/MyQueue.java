package com.arsatapathy.queue;

public interface MyQueue<T> {
    boolean isEmpty();
    T peek();
    void enqueue(T data);
    T dequeue();
}
