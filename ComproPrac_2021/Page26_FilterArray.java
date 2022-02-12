/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComproPrac_2021;

import java.util.Arrays;

/**
 *
 * @author faysalmazed
 */
public class Page26_FilterArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(filterArray(new int[]{8, 4, 9, 0, 3, 1, 2}, 88)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 0)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 1)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 2)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 3)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 4)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9, 5}, 3)));
        System.out.println(Arrays.toString(filterArray(new int[]{0, 9, 12, 18, -6}, 11)));
    }

    static int[] filterArray(int[] arr, int n) {
        int[] tempArr = new int[arr.length];
        int index = 0;
        for (int temp = n, selectedIndex = 0; temp >= 1; temp /= 2, ++selectedIndex) {
            int rem = temp % 2;
            if (rem == 1) {
                if (arr.length <= selectedIndex) {
                    return null;
                }
                tempArr[index] = arr[selectedIndex];
                ++index;

            }
        }
        int[] retArr = new int[index];
        for (int i = 0; i < index; ++i) {
            retArr[i] = tempArr[i];
        }

        return retArr;

    }

    static int[] filterArray2(int[] a, int n) {
        int count = 0;
        for (int i = n; i > 0; i /= 2) {
            if (i % 2 != 0) {
                ++count;
            }
        }
        int[] reArr = new int[count];
        int k = 0, index = 0;
        for (int j = n; j > 0; j /= 2) {
            if (index >= a.length) {
                return null;
            }
            if (j % 2 != 0) {
                reArr[k] = a[index];
                ++k;
            }
            ++index;
        }
        return reArr;
    }

    static int[] filterArray1(int[] a, int n) {

        int count = 0;
        int temp = n;
        while (temp >= 1) {
            int rem = temp % 2;
            if (rem != 0) {
                ++count;
            }
            temp /= 2;
        }

        int[] retArr = new int[count];

        temp = n;
        int i = 0;
        int index = 0;
        while (temp >= 1) {
            int rem = temp % 2;
            if (rem != 0) {
                if (i < a.length) {
                    retArr[index] = a[i];
                    ++index;
                } else {
                    return null;
                }
            }
            temp /= 2;
            ++i;
        }
        return retArr;

    }

}
