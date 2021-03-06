package com.arsatapathy.linkedlist;

import org.junit.Before;

public abstract class LinkedListStub {
    protected Node<String> a = new Node("A");
    protected Node<String> b = new Node("B");
    protected Node<String> c = new Node("C");
    protected Node<String> d = new Node("D");

    @Before
    public void init() {
        a.next = b;
        b.next = c;
        c.next = d;
    }
}
