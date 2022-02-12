/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComproPrac_2021;

/**
 *
 * @author faysalmazed
 */
public class Page61_IsComplete {

    public static void main(String[] args) {
        System.out.println(isComplete(new int[]{-5, 6, 2, 3, 2, 4, 5, 11, 8, 7}));
        System.out.println(isComplete(new int[]{5, 7, 9, 13}));
        System.out.println(isComplete(new int[]{2, 2}));
        System.out.println(isComplete(new int[]{2, 6, 3, 4}));
        System.out.println(isComplete(new int[]{1, 2, 3, 4, 5, 6}));
    }

    static int isComplete(int[] a) {
        int minEven = 0, maxEven = 0;
        int evenCount = 0;
        for (int i = 0; i < a.length; ++i) {
            if (a[i] % 2 == 0) {
                if (evenCount == 0) {
                    minEven = a[i];
                    maxEven = a[i];
                } else {
                    if (minEven > a[i]) {
                        minEven = a[i];
                    }
                    if (maxEven < a[i]) {
                        maxEven = a[i];
                    }
                }
                ++evenCount;
            }
        }
        if (evenCount == 0 || minEven == maxEven) {
            return 0;
        }
        for (int k = minEven; k <= maxEven; ++k) {
            boolean flug = false;
            for (int val : a) {
                if (val == k) {
                    flug = true;
                    break;
                }
            }
            if (!flug) {
                return 0;
            }
        }
        return 1;
    }
}
