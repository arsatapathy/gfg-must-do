package com.arsatapathy.stack;

public class MyStack {

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node top = null;


    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (top == null)
            throw new IllegalStateException("Empty stack");

        return top.data;
    }

    public void push(int data) {
        Node node = new Node(data);

        node.next = top;

        top = node;
    }

    public int pop() {
        int data = peek();

        top = top.next;

        return data;
    }
}
