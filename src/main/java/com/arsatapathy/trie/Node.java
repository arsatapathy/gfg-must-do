package com.arsatapathy.trie;

import java.util.HashMap;
import java.util.Map;

public class Node {
    Map<Character, Node> children;
    boolean endOfWord;

    Node() {
        children = new HashMap<>();
        endOfWord = false;
    }
}
