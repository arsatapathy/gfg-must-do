package com.arsatapathy.trie.mytrie;

public class MyTrieImpl implements MyTrie {
    @Override
    public void insert(String word) {
        Node current = root; 
        
        for (int i = 0; i < word.length(); i ++) {
            
            int index = word.charAt(i) - 'a'; 
            
            Node childNode = current.children[index];
            
            if (childNode == null) {
                childNode = new Node(); 
                current.children[index] = childNode; 
            }
            current = childNode; 
        }
        
        // Mark the last node as end of word (leaf) 
        current.endOfWord = true; 
    }

    @Override
    public void insert(String word, Node current, int i) {
        if (i == word.length()) {
            current.endOfWord = true;
            return;
        }
        
        int index = word.charAt(i) - 'a'; 
        
        Node childNode = current.children[index];
        
        if (childNode == null) {
            childNode = new Node(); 
            current.children[index] = childNode; 
        }
        
        insert(word, childNode, ++i);
    }

    @Override
    public boolean search(String word) {
        Node current = root; 
        
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            
            Node childNode = current.children[index];
            
            if (childNode == null) {
                return false; 
            }
            
            current = childNode;
        }
        
        return current.endOfWord;
    }

    @Override
    public boolean search(String word, Node current, int i) {
        if (i == word.length())
            return current.endOfWord; 
        
        int index = word.charAt(i) - 'a'; 
        
        Node childNode = current.children[index];
        
        if (childNode == null)
            return false; 
        
        return search(word, childNode, ++i); 
    }
}
