package com.arsatapathy.heap;

import java.util.Arrays;

public class MinHeap extends Heap<Integer> {

    public MinHeap(int capacity) {
        this.capacity = capacity;

        items = new Integer[this.capacity];
    }

    public void swap(int first, int second) {
        int temp = items[first];
        items[first] = items[second];
        items[second] = temp;
    }

    public void ensureCapacity() {
        if (size == capacity) {
            items = Arrays.copyOf(items, capacity * 2);
            capacity *= 2;
        }
    }

    public int peek() {
        if (size == 0) throw new IllegalStateException("This heap contains zero elements.");

        return items[0];
    }

    public int poll() {
        if (size == 0) throw new IllegalStateException("This heap contains zero elements.");

        int item = items[0];

        items[0] = items[size - 1];
        size--;

        heapifyDown();

        return item;
    }


    public void add(int item) {
        ensureCapacity();

        items[size] = item;
        size++;

        heapifyUp();
    }

    public void heapifyUp() {
        int current = size - 1;

        while (hasParent(current) && getParent(current) > items[current]) {
            swap(getParentIndex(current), current);
            current = getParentIndex(current);
        }
    }

    public void heapifyDown() {
        int current = 0;

        while (hasLeftChild(current)) {
            int smallerChildIndex = getLeftChildIndex(current);

            if (hasRightChild(current) && getRightChild(current) < getLeftChild(current)) {
                smallerChildIndex = getRightChildIndex(current);
            }

            if (items[current] < items[smallerChildIndex]) {
                break;
            } else {
                swap(current, smallerChildIndex);
            }

            current = smallerChildIndex;
        }

    }

}
