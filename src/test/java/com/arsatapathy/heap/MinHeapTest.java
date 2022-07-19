package com.arsatapathy.heap;

import org.junit.Assert;
import org.junit.Test;

public class MinHeapTest {

    @Test
    public void test_01() {
        MinHeap minHeap = new MinHeap(20);

        minHeap.add(6);
        minHeap.add(3);
        minHeap.add(9);
        minHeap.add(8);
        minHeap.add(5);
        minHeap.add(1);


        Assert.assertEquals(6, minHeap.size);
        Assert.assertEquals(1, minHeap.peek());
        Assert.assertEquals(1, minHeap.poll());
        Assert.assertEquals(5, minHeap.size);
    }
}
