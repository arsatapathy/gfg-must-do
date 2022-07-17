package com.arsatapathy.tree;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class DFSTest extends TreeStub {

    @Test
    public void test_01() {
        Assert.assertEquals(List.of(one, two, four, eight, five, three, six, seven), DFS.traverse(one, new LinkedList<>()));
    }

    @Test
    public void test_02() {
        Assert.assertEquals(List.of(one, three, seven, six, two, five, four, eight), DFS.traverse(DFS.invert(one), new LinkedList<>()));
    }

}
