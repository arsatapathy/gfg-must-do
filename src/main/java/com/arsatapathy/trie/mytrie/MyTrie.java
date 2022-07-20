package com.arsatapathy.trie.mytrie;

public interface MyTrie {
    Node root = new Node();

    void insert(String word); 
    void insert(String word, Node current, int i);
    boolean search(String word);
    boolean search(String word, Node current, int i);
}
