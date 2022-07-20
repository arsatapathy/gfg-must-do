package com.arsatapathy.queue;

public class MyQueueImpl<T> implements MyQueue<T> {
    Node<T> head;
    Node<T> tail;

    public MyQueueImpl() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public T peek() {
        if (head == null) throw new IllegalStateException("Empty queue.");
        
        return head.data;
    }

    @Override
    public void enqueue(T data) {
        Node<T> node = new Node<>(data);

        if (tail != null) {
            tail.next = node;
        }
        
        tail = node;

        if (head == null) {
            head = node;
        }
    }

    @Override
    public T dequeue() {
        T data = peek();
        
        head = head.next; 
        
        if (head == null) {
            tail = null; 
        }
        
        return data;
    }
}
