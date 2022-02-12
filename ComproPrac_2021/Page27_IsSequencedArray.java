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
public class Page27_IsSequencedArray {

    public static void main(String[] args) {
//        System.out.println(isSequencedArray(new int[]{2, 2, 3, 4, 4, 4, 5}, 2, 5));
//        System.out.println(isSequencedArray(new int[]{2, 2, 3, 5, 5, 5}, 2, 5));
//        System.out.println(isSequencedArray(new int[]{0, 2, 2, 3, 3}, 2, 3));
//        System.out.println(isSequencedArray(new int[]{1, 1, 3, 2, 24}, 1, 4));

        System.out.println(isSequencedArray(new int[]{1, 2, 3, 4, 5}, 1, 5));
        System.out.println(isSequencedArray(new int[]{1, 3, 4, 2, 5}, 1, 5));
        System.out.println(isSequencedArray(new int[]{-5, -5, -4, -4, -4, -3, -3, -2, -2, -2}, -5, -2));
        System.out.println(isSequencedArray(new int[]{0, 1, 2, 3, 4, 5}, 1, 5));

        System.out.println(isSequencedArray(new int[]{1, 2, 3, 4}, 1, 5));
        System.out.println(isSequencedArray(new int[]{1, 2, 5}, 1, 5));
        System.out.println(isSequencedArray(new int[]{5, 4, 3, 2, 1}, 1, 5));
    }

    static int isSequencedArray(int[] a, int m, int n) {
        for (int i = 0; i < a.length; ++i) {
            if (i < a.length - 1 && a[i] > a[i + 1]) {
                return 0;
            }
        }
        
        for (int j = m; j <= n; ++j) {
            boolean isValueAvaiable = false;
            for (int i = 0; i < a.length; ++i) {
                if(a[i]<m || a[i]>n) return 0;
                if (a[i] == j) {
                    isValueAvaiable = true;
                    break;
                }
            }
            if(!isValueAvaiable) return 0;
        }
        return 1;
    }
}
