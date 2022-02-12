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
public class Page3_IsMadhavArray_taugh {

    public static void main(String[] args) {
//        int[] a={3, 1, 2, 3, 0};
//        System.out.println(isMadhavArray(a));
        System.out.println(isMadhavArray(new int[]{2, 1, 1}));
        System.out.println(isMadhavArray(new int[]{2, 1, 1, 4, -1, -1}));
        System.out.println(isMadhavArray(new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0}));
        System.out.println(isMadhavArray(new int[]{18, 9, 10, 6, 6, 6}));
        System.out.println(isMadhavArray(new int[]{-6, -3, -3, 8, -5, -4}));
        System.out.println(isMadhavArray(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1}));
        System.out.println(isMadhavArray(new int[]{3, 1, 2, 3, 0}));
    }

    static int isMadhavArray(int[] a) {
        int calculation;
        boolean flug = false;
        for (int n = 1; n < a.length; n++) {
            calculation = (n * (n + 1)) / 2;
            
            if (calculation == a.length) {
                flug = true;
                break;
            }
        }
        if (!flug) {
            System.out.println("**********");
            return 0;
        }
        int sum, index = 1;
        for (int i = 2; index < a.length; i++) {
            sum = 0;
            for (int j = 1; j <= i; j++) {
                sum += a[index];
                ++index;
            }
            if (sum != a[0]) {
                return 0;
            }
        }
        return 1;
    }

}
