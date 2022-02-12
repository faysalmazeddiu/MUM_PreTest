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
public class Page22_IsPacked {

    public static void main(String[] args) {
        System.out.println(isPacked(new int[]{2, 2, 3, 3, 3}));
        System.out.println(isPacked(new int[]{2, 3, 2, 3, 3}));
        System.out.println(isPacked(new int[]{2, 2, 2, 3, 3, 3}));
//        //System.out.println(isPacked(new int[]{2, 2, 1}));
//
        System.out.println(isPacked(new int[]{2, 2, 1}));
        System.out.println(isPacked(new int[]{2, 2, 1, 2, 2}));
        System.out.println(isPacked(new int[]{4, 4, 4, 4, 1, 2, 2, 3, 3, 3}));
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 7, 7, 7, 1}));

        System.out.println(isPacked(new int[]{7, 7, 7, 7, 1, 7, 7, 7}));
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 7, 7, 7}));
        System.out.println(isPacked(new int[]{}));
        System.out.println(isPacked(new int[]{1, 2, 1}));
        System.out.println(isPacked(new int[]{2, 1, 1}));
        System.out.println(isPacked(new int[]{-3, -3, -3}));
        System.out.println(isPacked(new int[]{0, 2, 2}));
        System.out.println(isPacked(new int[]{2, 1, 2}));
    }

    static int isPacked(int[] arr) {
        if (arr.length == 0 || arr == null) {
            return 1;
        }

        for (int indexForFirstLoop = 0; indexForFirstLoop < arr.length; indexForFirstLoop++) {
            if (arr[indexForFirstLoop] < 0) {
                return 0;
            }
            int count = 0;
            for (int indexForSecondLoop = 0; indexForSecondLoop < arr.length; ++indexForSecondLoop) {
                if (arr[indexForFirstLoop] == arr[indexForSecondLoop]) {
                    ++count;
                }
            }
            if (count != arr[indexForFirstLoop]) {
                return 0;
            }
        }

        int j = 0;
        for (int i = 0; i < arr.length;) {
            
            for (j = i; j < i + arr[i] && j < arr.length; ++j) {
                if (arr[j] != arr[i]) {
                    return 0;
                }
            }
            i = j;
        }
        return 1;
    }

    static int isPacked1(int[] a) {

        int index = 0, totalCount = 0;
        for (int i = 0; i < a.length; i++) {
            totalCount = 0;
            for (int val : a) {
                if (val < 0) {
                    return 0;
                }
                if (val == a[i]) {
                    ++totalCount;
                }
            }
            if (totalCount != a[i]) {
                return 0;
            }
            index = i;
            for (int j = 1; j <= a[i]; ++j) {
                if (a[i] != a[index]) {
                    return 0;
                }
                ++index;
            }
            i = index - 1;
        }
        return 1;
    }

    //2, 2, 3, 3, 3
    //0  1  2  3  4
    static int isPacked2(int[] a) {

        int element = 0, consCount = 0, index = 0, totalCount = 0;
        for (int i = 0; i < a.length; i++) {
            totalCount = 0;
            for (int val : a) {
                if (val < 0) {
                    return 0;
                }
                if (val == a[i]) {
                    ++totalCount;
                }
            }
            consCount = 0;
            element = a[i];
            index = i;
            for (int j = 1; j <= a[i]; ++j) {
                if (a[i] != a[index]) {
                    return 0;
                } else {
                    ++consCount;
                }
                ++index;
            }
            if (totalCount != element || consCount != element) {
                return 0;
            }
            i = index - 1;
        }
        return 1;
    }

}
