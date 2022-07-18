package com.arsatapathy.trie;

public class TrieImpl implements Trie {
    private Node root;

    public TrieImpl() {
        root = new Node();
    }

    @Override
    public void insert(String word) {
        Node current = root;

        for (var i = 0; i < word.length(); i ++) {
            Character c = word.charAt(i);

            Node node = current.children.get(c);

            if (node == null) {
                node = new Node();
                current.children.put(c, node);
            }

            current = node;
        }

        current.endOfWord = true;
    }

    public void insert(Node current, String word, int index) {
        if (index == word.length()) {
            current.endOfWord = true;
            return;
        }

        Character c = word.charAt(index);

        Node node = current.children.get(c);

        if (node == null) {
            node = new Node();
            current.children.put(c, node);
        }

        insert(node, word, ++index);
    }

    @Override
    public boolean search(String word) {
        Node current = root;

        for (var i = 0; i < word.length(); i++) {
            Character c = word.charAt(i);

            Node node = current.children.get(c);

            if (node == null) {
                return false;
            }

            current = node;
        }

        return current.endOfWord;
    }

    public boolean search(Node current, String word, int index) {
        if (index == word.length())
            return current.endOfWord;

        Character c = word.charAt(index);
        Node node = current.children.get(c);

        if (node == null) {
            return false;
        }

        return search(node, word, ++index);
    }
}
