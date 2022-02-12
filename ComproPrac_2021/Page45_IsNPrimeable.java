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
public class Page45_IsNPrimeable {

    public static void main(String[] args) {
        System.out.println(isNPrimeable(new int[]{5, 15, 27}, 2));
        System.out.println(isNPrimeable(new int[]{5, 15, 27}, 3));
        System.out.println(isNPrimeable(new int[]{5, 15, 26}, 2));
        System.out.println(isNPrimeable(new int[]{1, 1, 1, 1, 1, 1, 1}, 4));
        System.out.println(isNPrimeable(new int[]{}, 2));
    }

    static int isNPrimeable(int[] a, int n) {
        for (int val : a) {
            if(val+n<=1) return 0;
            for (int i = 2; i < (val + n); i++) {
                if ((val + n) % i == 0) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
