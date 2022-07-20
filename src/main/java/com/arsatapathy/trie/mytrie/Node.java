package com.arsatapathy.trie.mytrie;

public class Node {
    private final int ALPHABET_SIZE = 26;
    Node[] children; 
    boolean endOfWord;
    
    Node() {
        children = new Node[ALPHABET_SIZE];
        
        for (Node child :children) {
            child = null; 
        }
        
        endOfWord = false; 
    }
}
