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
public class Page68_IsSetEqual {

    public static void main(String[] args) {
        System.out.println(isSetEqual(new int[]{1, 9, 12},new int[]{12, 1, 9}));
        System.out.println(isSetEqual(new int[]{9, 1, 12, 1},new int[]{12, 1, 9}));
        System.out.println(isSetEqual(new int[]{9, 1, 12, 1},new int[]{1,9,12, 9, 12, 1, 9}));
        System.out.println(isSetEqual(new int[]{1, 7, 8},new int[]{1, 7, 1}));
        System.out.println(isSetEqual(new int[]{1, 7, 1},new int[]{1, 7, 6}));
    }

    static int isSetEqual(int[] a, int[] b) {

        for (int value : a) {
            boolean flug = false;
            for (int val : b) {
                if (value == val) {
                    flug = true;
                    break;
                }
            }
            if (!flug) {
                return 0;
            }
        }

        for (int value : b) {
            boolean flug = false;
            for (int val : a) {
                if (value == val) {
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
