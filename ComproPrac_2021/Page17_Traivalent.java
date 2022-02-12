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
public class Page17_Traivalent {

    public static void main(String[] args) {
        System.out.println(traivalent(new int[]{22, 19, 10, 10, 19, 22, 22, 10}));
        System.out.println(traivalent(new int[]{1, 2, 2, 2, 2, 2, 2}));
        System.out.println(traivalent(new int[]{2, 2, 3, 3, 3, 3, 2, 41, 65}));
        System.out.println(traivalent(new int[]{-1, 0, 1, 0, 0, 0}));
        System.out.println(traivalent(new int[]{}));
        System.out.println(traivalent(new int[]{2147483647,-1,-1,-2147483648}));
    }

    static int traivalent(int[] a) {
         
        int count = 0;
        boolean flug;
        for (int i = 0; i < a.length; i++) {
            flug = true;
            for (int j = 0; j < i; j++) {
                if (a[j] == a[i]) {
                    flug = false;
                    break;
                }

            }
            if (flug == true) {
                ++count;
            }
        }

        if (count != 3) {
            return 0;
        }
        return 1;

    }

}
