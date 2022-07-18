package com.arsatapathy.linkedlist;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ReverseLinkedListTest extends LinkedListStub {

    @Test
    public void test_01() {
        MyLinkedList<String> myLinkedList = new MyLinkedListImpl();

        Assert.assertEquals(List.of(d, c, b, a), myLinkedList.traverse(myLinkedList.reverse(a)));
    }
}
