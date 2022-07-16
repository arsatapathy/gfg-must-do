package com.arsatapathy.graph;

import java.util.*;

public class DFS implements Graph {
    @Override
    public void traverse(ArrayList<ArrayList<Integer>> adj, int start) {
        traverse(adj, start, new HashSet<>());
    }

    public void traverse(ArrayList<ArrayList<Integer>> adj, int start, Set<Integer> visited) {

        if (!visited.contains(start)) {
            System.out.println(start);
            visited.add(start);

            for (int neighbour : adj.get(start)) {
                traverse(adj, neighbour, visited);
            }
        }

    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        DFS bfs = new DFS();

        bfs.init(adj, 5);

        bfs.add(adj, 0, 1);
        bfs.add(adj, 0, 2);
        bfs.add(adj, 0, 3);
        bfs.add(adj, 2, 4);

        System.out.println(adj);

        bfs.traverse(adj, 0);
    }
}
