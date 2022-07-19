package com.arsatapathy.dinamic;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class GridTravelerTest {

    @Test
    public void test_01() {
        GridTraveler gridTraveler = new GridTraveler();

        Assert.assertEquals(3, gridTraveler.travel(2,3));
        Assert.assertEquals(3, gridTraveler.travel(2,3, new HashMap<>()));
    }
}
