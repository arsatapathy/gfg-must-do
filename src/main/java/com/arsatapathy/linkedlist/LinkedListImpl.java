package com.arsatapathy.linkedlist;

import java.util.LinkedList;
import java.util.List;

// Given a linked list of N nodes. The task is to reverse this list.
public class LinkedListImpl {
    public Node reverse(Node head) {
        Node previous = null;
        Node next = null;

        while (head != null) {
            next = head.next;
            head.next = previous;
            previous = head;
            head = next;
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
