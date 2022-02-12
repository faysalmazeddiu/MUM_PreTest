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
public class Page74_IsDual {

    public static void main(String[] args) {
        System.out.println(isDual(new int[]{1, 2, 3, 0}));
        System.out.println(isDual(new int[]{1, 2, 2, 1, 3, 0}));
        System.out.println(isDual(new int[]{1, 2, 3, 0}));
        System.out.println(isDual(new int[]{1, 1, 2, 2}));
        System.out.println(isDual(new int[]{}));
    }

    static int isDual(int[] a) {
        if (a.length % 2 != 0) {
            return 0;
        }
        int prevSum = 0;
        int sum = 0;
        for (int i = 0; i < a.length; i += 2) {
            if (a[i] % 2 == 0 && a[i + 1] % 2 == 0) {
                return 0;
            } else {
                if (i == 0) {
                    prevSum = a[i] + a[i + 1];
                } else {
                    sum = a[i] + a[i + 1];
                }
            }

            if (i != 0 && prevSum != sum) {
                return 0;
            }

        }
        return 1;
    }
}
