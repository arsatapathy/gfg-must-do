package com.arsatapathy.graph;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public interface Graph {
    default void init(ArrayList<ArrayList<Integer>> adj, int n) {
        for (int i = 0; i < n; i++) {
            adj.add(i, new ArrayList<>());
        }
    }

    default void add(@NotNull ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    void traverse(ArrayList<ArrayList<Integer>> adj,int start);
}
