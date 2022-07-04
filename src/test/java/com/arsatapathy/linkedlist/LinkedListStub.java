package com.arsatapathy.linkedlist;

import org.junit.Before;

public abstract class LinkedListStub {
    protected Node a = new Node("A");
    protected Node b = new Node("B");
    protected Node c = new Node("C");
    protected Node d = new Node("D");

    @Before
    public void init() {
        a.next = b;
        b.next = c;
        c.next = d;
    }
}
