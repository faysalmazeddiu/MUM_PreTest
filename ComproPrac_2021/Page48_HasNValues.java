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
public class Page48_HasNValues {

    public static void main(String[] args) {
        System.out.println(hasNValue(new int[]{1, 2, 2, 1},2));
        System.out.println(hasNValue(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3},3));
        System.out.println(hasNValue(new int[]{1, 2, 3, 4, 5, 6, 7, 8 ,9, 10},10));
        System.out.println(hasNValue(new int[]{1, 2, 2, 1},3));
        System.out.println(hasNValue(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3},2));
        System.out.println(hasNValue(new int[]{1, 2, 3, 4, 5, 6, 7, 8 ,9, 10},20));
    }

    static int hasNValue(int[] a, int n) {
        int[] tempArr = new int[n];
        int index = 0;
        for (int i = 0; i < a.length; ++i) {
            boolean flug = true;
            for (int value : tempArr) {
                if (a[i] == value) {
                    flug = false;
                    break;
                }
            }
            if (flug) {
                if (index >= n) {
                    return 0;
                }
                tempArr[index] = a[i];
                ++index;
            }
        }
        if(n!=index) return 0;
        return 1;
    }
}
