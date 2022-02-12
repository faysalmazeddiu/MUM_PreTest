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
public class Page45_Is121Array {

    public static void main(String[] args) {
        System.out.println(is123Array(new int[]{1, 2, 1}));
        System.out.println(is123Array(new int[]{1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is123Array(new int[]{1, 1, 2, 2, 2, 1, 1, 1}));
        System.out.println(is123Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1}));

        System.out.println(is123Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 3}));
        System.out.println(is123Array(new int[]{1, 1, 1, 1, 1, 1}));
        System.out.println(is123Array(new int[]{2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1, 1}));
        System.out.println(is123Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 2, 2}));
        System.out.println(is123Array(new int[]{2, 2, 2}));
    }

    static int is123Array(int[] a) {
//        if (a[0] != 1 || a[a.length - 1] != 1) {
//            return 0;
//        }
        int countFirstOne = 0, countMidTwo = 0, countLastOne = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 1 && a[i] > 2) {
                return 0;
            }
            if (countMidTwo == 0 && countLastOne == 0 && a[i] == 1) {
                ++countFirstOne;
                continue;
            }
            if (countFirstOne > 0 && countLastOne == 0 && a[i] == 2) {
                ++countMidTwo;
                continue;
            }

            if (countFirstOne > 0 && countMidTwo > 0 && a[i] == 1) {
                ++countLastOne;
            }
        }
        if(countFirstOne==0 || countLastOne==0 || countMidTwo==0 || countFirstOne!=countLastOne || (countFirstOne+countLastOne+countMidTwo)!=a.length) return 0;
        return 1;
    }
}
