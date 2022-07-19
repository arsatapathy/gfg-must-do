package com.arsatapathy.dinamic;

import java.util.Map;

public class GridTraveler {

    public int travel(int row, int column) {
        if (row == 1 && column == 1) return 1;
        if (row ==0 || column == 0) return 0;

        return travel(row, column - 1) + travel(row -1, column);
    }

    public int travel(int row, int column, Map<String, Integer> visited) {
        if (row == 1 && column == 1) return 1;
        if (row ==0 || column == 0) return 0;

        if (visited.containsKey(row + "-" + column)) {
            return visited.get(row + "-" + column);
        }

        int count = travel(row, column - 1, visited) + travel(row - 1, column, visited);

        visited.put(row + "-" + column, count);

        return count;
    }
}
