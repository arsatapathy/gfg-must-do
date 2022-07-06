package com.arsatapathy.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class LeftViewTree {
    public static ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        if (root != null) queue.add(root);

        while (!queue.isEmpty()) {
            int n = queue.size();

            for (int i = 1; i <= n; i++) {
                Node current = queue.remove();
                if (i == 1) {
                    list.add(current.data);
                }

                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
        }

        return list;
    }

    public static ArrayList<Integer> leftView(Node root, int level, ArrayList<Integer> list, Set<Integer> visited) {
        if (root == null) return new ArrayList<>();

        if (!visited.contains(level)) {
            list.add(root.data);
            visited.add(level);
        }

        leftView(root.left, level + 1, list, visited);
        leftView(root.right, level + 1, list, visited);

        return list;
    }

}
