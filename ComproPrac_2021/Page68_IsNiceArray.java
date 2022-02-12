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
public class Page68_IsNiceArray {

    public static void main(String[] args) {
        System.out.println(isNiceArray(new int[]{21, 3, 7, 9,11,4,6}));
        System.out.println(isNiceArray(new int[]{13,4,4,4,4}));
        System.out.println(isNiceArray(new int[]{10,5,5}));
        System.out.println(isNiceArray(new int[]{10,5,5}));
        System.out.println(isNiceArray(new int[]{0,6,8,20}));
        System.out.println(isNiceArray(new int[]{3}));

        System.out.println(isNiceArray(new int[]{8, 5, -5, 5, 3}));
    }

    static int isNiceArray(int[] a) {
        int sum = 0;
        for (int val : a) {
            boolean flug = true;
            if (val <= 1) {
                flug = false;
            } else {
                for (int i = 2; i < val; ++i) {
                    if (val % i == 0) {
                        flug = false;
                        break;
                    }
                }

            }

            if (flug) {
               // System.out.println("====" + val);
                sum += val;
            }
        }
        if (sum == a[0]) {
            return 1;
        }
        return 0;
    }

}
