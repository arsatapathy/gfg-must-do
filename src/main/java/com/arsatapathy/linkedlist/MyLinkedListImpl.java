package com.arsatapathy.linkedlist;

import java.util.LinkedList;
import java.util.List;

// Given a linked list of N nodes. The task is to reverse this list.
public class MyLinkedListImpl implements MyLinkedList<String> {
    public Node<String> reverse(Node<String> head) {
        Node<String> current = head;
        Node<String> previous = null;
        Node<String> next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }

    public List<Node<String>> traverse(Node<String> head) {
        List<Node<String>> list = new LinkedList<>();
        Node<String> current = head;

        while (current != null) {
            list.add(current);
            current = current.next;
        }

        return list;
    }
}
