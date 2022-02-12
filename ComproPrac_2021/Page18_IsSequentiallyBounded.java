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
public class Page18_IsSequentiallyBounded {

    public static void main(String[] args) {
        System.out.println(isSequentiallyBounded(new int[]{2, 3, 3, 99, 99, 99, 99, 99}));
        System.out.println(isSequentiallyBounded(new int[]{1, 2, 3}));
        System.out.println(isSequentiallyBounded(new int[]{2, 3, 3, 3, 3}));
        System.out.println(isSequentiallyBounded(new int[]{12, 12, 9}));
        System.out.println(isSequentiallyBounded(new int[]{0, 1}));
        System.out.println(isSequentiallyBounded(new int[]{-1, 2}));
        System.out.println(isSequentiallyBounded(new int[]{}));
        System.out.println(isSequentiallyBounded(new int[]{5, 5, 5, 5}));
        System.out.println(isSequentiallyBounded(new int[]{5, 5, 5, 2, 5}));
    }

    static int isSequentiallyBounded(int[] a) {
        for (int i = 0; i < a.length - 1; ++i) {
            if (a[i] > a[i + 1]) {
                return 0;
            }
        }
        int count = 0;
        for (int j = 0; j < a.length; ++j) {
            count = 0;
            for (int k = 0; k < a.length; ++k) {
                if (a[j] == a[k]) {
                    ++count;
                }
            }
            if (count >= a[j]) {
                return 0;
            }
        }
        return 1;
    }
}
