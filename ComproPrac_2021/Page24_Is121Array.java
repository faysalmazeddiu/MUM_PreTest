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
public class Page24_Is121Array {

    public static void main(String[] args) {
        System.out.println(is121Array(new int[]{1, 2, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 1, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 3}));

        System.out.println(is121Array(new int[]{1, 1, 1, 1, 1, 1}));
        System.out.println(is121Array(new int[]{2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 2, 2}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 2, 2}));
        System.out.println(is121Array(new int[]{2, 2, 2}));
    }

    static int is121Array1(int[] a) {
        int initialCountOne = 0, lastCountOne = 0, countTwo = 0;
        for (int i = 0; i < a.length; ++i) {
            if (a[i] < 0 || a[i] > 2 || a[0] != 1 || a[a.length - 1] != 1) {
                return 0;
            }
            if (countTwo == 0 && a[i] == 1) {

                ++initialCountOne;
                continue;
            }
            if (initialCountOne != 0 && a[i] == 2) {
                if (lastCountOne != 0) {
                    return 0;
                }
                ++countTwo;
                continue;
            }

            if (initialCountOne != 0 && countTwo != 0 && a[i] == 1) {
                ++lastCountOne;
            }
        }
        if (initialCountOne != lastCountOne || countTwo == 0) {
            return 0;
        }
        return 1;
    }

    static int is121Array(int[] arr) {
        int countFirstSeriesOne = 0;
        int i = 0;
        while (i<arr.length && arr[i] == 1) {
            ++countFirstSeriesOne;
            ++i;
        }
        
        int countLastSeriesOne = 0;
        int j = arr.length - 1;
        while (j>=0 && arr[j] == 1) {
            ++countLastSeriesOne;
            --j;
        }
        if (countFirstSeriesOne == 0 || countLastSeriesOne == 0 || countFirstSeriesOne==arr.length || countLastSeriesOne==arr.length  || (countFirstSeriesOne != countLastSeriesOne)) {
            return 0;
        }
        while (i <= j) {
            if (arr[i] != 2) {
                return 0;
            }
            ++i;
        }

        return 1;
    }

}
