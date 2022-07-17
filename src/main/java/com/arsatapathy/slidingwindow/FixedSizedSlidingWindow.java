package com.arsatapathy.slidingwindow;

/*
Suppose the problem gives us an array of length n and a number k.
The problem asks us to find the maximum sum of k consecutive elements inside the array.
 */
public class FixedSizedSlidingWindow {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};

        int k = 3;
        int n = array.length;

        System.out.println(maxSum(array, n, k));
        System.out.println(maxSum(array, k));
    }


    // Time Complexity - O(n^2)
    public static int maxSum(int[] array, int n, int k) {
        int maxSum = 0;

        for (int i = 0; i < n - k + 1; i++) {
            int sum = 0;
            for (int j = i; j < i + k ;j++) {
                sum += array[j];
            }

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    public static int maxSum(int[] array, int k) {
        int maxSum = 0;
        int sum = 0;
        int n = array.length;

        for (int i = 0; i < k; i ++) {
            sum += array[i];
        }

        for (int j = k; j < n; j ++) {
            sum += array[j] - array[j - k];
            maxSum = Math.max(sum, maxSum);
        }

        return maxSum;
    }
}
