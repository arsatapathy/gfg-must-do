package com.arsatapathy.graph;

import java.util.*;

public class BFS implements Graph {

    @Override
    public void traverse(ArrayList<ArrayList<Integer>> adj, int start) {
        traverse(adj, start, new HashSet<>());
    }

    public void traverse(ArrayList<ArrayList<Integer>> adj, int start, Set<Integer> visited) {
        Queue<Integer> queue = new LinkedList<>();

        if (!visited.contains(start)) {
            queue.add(start);
            visited.add(start);


            while (!queue.isEmpty()) {
                Integer current = queue.remove();

                System.out.println(current);

                for (Integer neighbour : adj.get(current)) {
                    if (!visited.contains(neighbour)) {
                        queue.add(neighbour);
                        visited.add(neighbour);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        BFS bfs = new BFS();

        bfs.init(adj, 5);

        bfs.add(adj, 0, 1);
        bfs.add(adj, 0, 2);
        bfs.add(adj, 0, 3);
        bfs.add(adj, 2, 4);

        System.out.println(adj);

        bfs.traverse(adj, 0);
    }
}
