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
public class Page50_IsLayered {

    public static void main(String[] args) {
        System.out.println(isLayered(new int[]{1, 1, 2, 2, 2, 3, 3}));
        System.out.println(isLayered(new int[]{3, 3, 3, 3, 3, 3, 3}));
        System.out.println(isLayered(new int[]{1, 2, 2, 2, 3, 3}));
        System.out.println(isLayered(new int[]{2, 2, 2, 3, 3, 1, 1}));
        System.out.println(isLayered(new int[]{2}));
        System.out.println(isLayered(new int[]{}));
        System.out.println(isLayered(new int[]{1, 2, 2, 2, 3, 3}));
        System.out.println(isLayered(new int[]{3, 3, 1, 1, 1, 2, 2}));
    }

    static int isLayered(int[] a) {
        if(a.length==0 || a==null) return 0;
        int count = 0;
        for (int i = 0; i < a.length; ++i) {
            if (i < a.length - 1 && a[i] > a[i + 1]) {
                return 0;
            }
            count = 0;
            for (int j = 0; j < a.length; ++j) {
                if (a[i] == a[j]) {
                    ++count;
                }
            }
            if(count<2) return 0;
        }
        return 1;
    }
}
