package com.arsatapathy.tree;

import java.util.List;

public class DFS {
    public static List<Node> traverse(Node root, List<Node> list) {
        if (root == null) return list;

        list.add(root);

        traverse(root.left, list);
        traverse(root.right, list);

        return list;
    }

    public static Node invert(Node root) {
        if (root == null) return null;

        var temp = root.left;
        root.left = root.right;
        root.right = temp;

        invert(root.left);
        invert(root.right);

        return root;
    }
}
