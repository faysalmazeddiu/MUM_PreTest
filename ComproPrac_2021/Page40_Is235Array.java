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
public class Page40_Is235Array {

    public static void main(String[] args) {
        System.out.println(is235Array(new int[]{2, 3, 5, 7, 11}));
        System.out.println(is235Array(new int[]{2, 3, 6, 7, 11}));
        System.out.println(is235Array(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(is235Array(new int[]{2, 4, 8, 16, 32}));
        System.out.println(is235Array(new int[]{3, 9, 27, 7, 1, 1, 1, 1, 1}));
        System.out.println(is235Array(new int[]{7, 11, 77, 49}));
        System.out.println(is235Array(new int[]{2}));
        System.out.println(is235Array(new int[]{}));
        System.out.println(is235Array(new int[]{7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7}));
    }

    static int is235Array(int[] a) {
        int devisable = 0;
        int notDesible = 0;
        for (int val : a) {
            if (val % 2 != 0 && val % 3 != 0 && val % 5 != 0) {
                ++notDesible;
            } else {
                if (val % 2 == 0) {
                    ++devisable;
                }
                if (val % 3 == 0) {
                    ++devisable;
                }
                if (val % 5 == 0) {
                    ++devisable;
                }

            }

        }
        //System.out.println(devisable + "====" + notDesible);
        if (devisable + notDesible != a.length) {
            return 0;
        }
        return 1;
    }

}
