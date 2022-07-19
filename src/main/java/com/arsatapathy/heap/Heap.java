package com.arsatapathy.heap;

import java.util.Arrays;

public abstract class Heap<T> {
    int capacity;
    int size = 0;
    T[] items;

    public int getLeftChildIndex(int parentIndex) {
        return (parentIndex * 2) + 1;
    }

    public int getRightChildIndex(int parentIndex) {
        return (parentIndex * 2) + 2;
    }

    public int getParentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    public boolean hasLeftChild(int parentIndex) {
        return getLeftChildIndex(parentIndex) < size;
    }

    public boolean hasRightChild(int parentIndex) {
        return getRightChildIndex(parentIndex) < size;
    }

    public boolean hasParent(int childIndex) {
        return getParentIndex(childIndex) >= 0;
    }

    public T getLeftChild(int parentIndex) {
        return items[getLeftChildIndex(parentIndex)];
    }

    public T getRightChild(int parentIndex) {
        return items[getRightChildIndex(parentIndex)];
    }

    public T getParent(int childIndex) {
        return items[getParentIndex(childIndex)];
    }


}
