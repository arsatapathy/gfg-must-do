package com.arsatapathy.tree;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LeveViewTreeTest extends TreeStub {

    @Test
    public void test_01() {
        Assert.assertEquals(List.of(one.data, two.data, four.data, eight.data), LeftViewTree.leftView(one));
    }

    @Test
    public void test_02() {
        Assert.assertEquals(List.of(one.data, two.data, four.data, eight.data), LeftViewTree.leftView(one, 0, new ArrayList<>(), new HashSet<>()));
    }
}
