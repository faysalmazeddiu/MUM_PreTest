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
public class Page18_IsMinMaxDisjoint {

    public static void main(String[] args) {
        System.out.println(isMinMaxDisjoint(new int[]{5, 4, 1, 3, 2}));
        System.out.println(isMinMaxDisjoint(new int[]{18, -1, 3, 4, 0}));
        System.out.println(isMinMaxDisjoint(new int[]{9, 0, 5, 9}));
        System.out.println(isMinMaxDisjoint(new int[]{0, 5, 18, 0, 9}));
        System.out.println(isMinMaxDisjoint(new int[]{7, 7, 7, 7}));
        System.out.println(isMinMaxDisjoint(new int[]{}));
        System.out.println(isMinMaxDisjoint(new int[]{1, 2}));
        System.out.println(isMinMaxDisjoint(new int[]{1}));
    }

    static int isMinMaxDisjoint(int[] a) {
        if (a.length <= 1) {
            return 0;
        }
        int max = 0, min = 0;
        for (int i = 0; i < a.length; ++i) {
            if (i == 0) {
                max = a[i];
                min = a[i];
            } else {
                if (max < a[i]) {
                    max = a[i];
                }
                if (min > a[i]) {
                    min = a[i];
                }

            }
        }
        if (min == max) {
            System.out.println("min_max_different");
            return 0;
        }
        int countMax = 0;
        int countMin = 0;
        for (int j = 0; j < a.length; ++j) {
            if (max == a[j]) {
                ++countMax;
            }
            if (min == a[j]) {
                ++countMin;
            }
            if (j < a.length - 1 && (max == a[j] && min == a[j + 1]) || (min == a[j] && max == a[j + 1])) {
                System.out.println("adjacent");
                return 0;
            }

        }
        if (countMax != 1 || countMin != 1) {
            System.out.println("twice");
            return 0;
        }

        return 1;
    }
}
