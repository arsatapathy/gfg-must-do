package com.arsatapathy.queue;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class MyQueueImplTest {

    @Test
    public void test_01() {
        MyQueue<Integer> myQueue = new MyQueueImpl<>();

        Assert.assertTrue(myQueue.isEmpty());

        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);

        Assert.assertFalse(myQueue.isEmpty());

        Assert.assertEquals(1, (int) myQueue.peek());
        Assert.assertEquals(1, (int) myQueue.dequeue());
        Assert.assertEquals(2, (int) myQueue.dequeue());
        Assert.assertEquals(3, (int) myQueue.dequeue());
        Assert.assertEquals(4, (int) myQueue.dequeue());
        Assert.assertEquals(5, (int) myQueue.dequeue());

        Assert.assertTrue(myQueue.isEmpty());
    }
}
