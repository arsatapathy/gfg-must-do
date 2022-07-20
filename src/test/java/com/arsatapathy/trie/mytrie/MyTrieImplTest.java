package com.arsatapathy.trie.mytrie;

import org.junit.Assert;
import org.junit.Test;

public class MyTrieImplTest {

    @Test
    public void test_01() {
        MyTrie impl = new MyTrieImpl();

        impl.insert("ab", impl.root, 0);
        impl.insert("abc");
        impl.insert("abcd");
        impl.insert("abcde");

        Assert.assertTrue(impl.search("ab"));
        Assert.assertTrue(impl.search("abc"));
        Assert.assertTrue(impl.search("abc", impl.root, 0));
        Assert.assertTrue(impl.search("abcde"));

        Assert.assertFalse(impl.search("xy"));
        Assert.assertFalse(impl.search("abcdef", impl.root, 0));
    }
}
