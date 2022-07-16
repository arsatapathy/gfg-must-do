package com.arsatapathy.array;

public class BinarySearch implements Search {
    @Override
    public int search(int[] array, int x) {
        return search(array, x, 0, array.length - 1);
    }

    public int search(int[] array, int x, int min, int max) {

        if (min <= max) {
            int mid = (min + max) / 2;

            if (array[mid] == x) {
                return mid;
            }

            if (array[mid] > x) {
                return search(array, x, min, mid - 1);
            }

            if (array[mid] < x) {
                return search(array, x, mid + 1, max);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();

        System.out.println(bs.search(new int[] {2, 4, 6, 8, 9, 10}, 8));
    }
}
