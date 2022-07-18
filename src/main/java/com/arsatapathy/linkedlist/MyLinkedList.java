package com.arsatapathy.linkedlist;

import java.util.List;

public interface MyLinkedList<T> {
    List<Node<T>> traverse(Node<T> head);

    Node<T> reverse(Node<T> head);
}
