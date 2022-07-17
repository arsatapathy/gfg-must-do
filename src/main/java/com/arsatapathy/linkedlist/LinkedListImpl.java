package com.arsatapathy.linkedlist;

import java.util.LinkedList;
import java.util.List;

// Given a linked list of N nodes. The task is to reverse this list.
public class LinkedListImpl {
    public Node reverse(Node head) {
        Node current = head;
        Node previous = null;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }

    public List<Node> traverse(Node head) {
        List<Node> list = new LinkedList<>();
        Node current = head;

        while (current != null) {
            list.add(current);
            current = current.next;
        }

        return list;
    }
}
