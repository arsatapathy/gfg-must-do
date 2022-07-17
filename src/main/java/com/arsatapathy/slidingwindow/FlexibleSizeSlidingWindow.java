package com.arsatapathy.slidingwindow;

/*
Suppose we have n books aligned in a row. For each book, we know the number of minutes needed to read it.
However, we only have k free minutes to read.
Therefore, the problem asks us to find the maximum number of books we can read.
 */

public class FlexibleSizeSlidingWindow {
    public static int maxNumberOfBooks(int[] array, int k) {
        var maxLength = 0;
        var left = 0;
        var right = 0;
        var sum = 0;
        var n = array.length;

        while (left < n) {
            if (left > 0) {
              sum = sum - array[left - 1];
            }

            while (right < n && sum + array[right] < k) {
                sum += array[right];
                right ++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
            left ++;
        }

        return maxLength;
    }

    public static int maxNumberOfBooks(int[] array, int k, int n) {
        int maxLength = 0;

        for (var i = 0; i < n; i++) {
            var sum = 0;
            var count = 0;
            var j = i;

            while (j < n && sum + array[j] <= k) {
                sum += array[j];
                j++;
                count++;
            }

            maxLength = Math.max(count, maxLength);

        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(maxNumberOfBooks(array, 10));
        System.out.println(maxNumberOfBooks(array, 10, array.length));
    }
}
