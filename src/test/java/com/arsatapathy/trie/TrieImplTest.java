package com.arsatapathy.trie;

import org.junit.Assert;
import org.junit.Test;

public class TrieImplTest {

    @Test
    public void test_01() {
        TrieImpl impl = new TrieImpl();

        impl.insert("abc");
        impl.insert("abcd");
        impl.insert("abcde");
        impl.insert("123");
        impl.insert("1234");
        impl.insert("12345");
        impl.insert("123456");

        Assert.assertTrue(impl.search("abc"));
        Assert.assertTrue(impl.search("abcde"));
        Assert.assertTrue(impl.search("1234"));

        Assert.assertFalse(impl.search("ab"));
        Assert.assertFalse(impl.search("12"));
    }
}
