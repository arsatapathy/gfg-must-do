package com.arsatapathy.linkedlist;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ReverseLinkedListTest extends LinkedListStub {

    @Test
    public void test_01() {
        LinkedListImpl impl = new LinkedListImpl();

        Assert.assertEquals(List.of(d, c, b, a), impl.traverse(impl.reverse(a)));
    }
}
