package com.c05;

public class ForEach3 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] nums = new int[3][5];

        // give nums some values
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                nums[i][j] = (i + 1) * (j + 1);

        // use for-each for to display and sum the values
        for (int[] x : nums) {
            for (int y : x) {
                System.out.println("Value is: " + y);
                sum += y;
            }
        }
        System.out.println("Summation: " + sum);
    }
}

/*
 * |1 2 3 4 5 |
 * |2 4 6 8 10|
 * |3 6 9 12 15|
 *
 * Value is: 1
 * Value is: 2
 * Value is: 3
 * Value is: 4
 * Value is: 5
 * Value is: 2
 * Value is: 4
 * Value is: 6
 * Value is: 8
 * Value is: 10
 * Value is: 3
 * Value is: 6
 * Value is: 9
 * Value is: 12
 * Value is: 15
 * Summation: 90
 */
