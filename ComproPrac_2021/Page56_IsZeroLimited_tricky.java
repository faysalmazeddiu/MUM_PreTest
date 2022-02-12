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
public class Page56_IsZeroLimited_tricky {

    public static void main(String[] args) {
        System.out.println(isZeroLimited(new int[]{0, 0, 0, 0, 0}));
        System.out.println(isZeroLimited(new int[]{1, 0}));
        System.out.println(isZeroLimited(new int[]{0, 1}));
        System.out.println(isZeroLimited(new int[]{5}));
        System.out.println(isZeroLimited(new int[]{1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0}));
        System.out.println(isZeroLimited(new int[]{}));
    }

    static int isZeroLimited(int[] a) {
        if (a.length <= 1) {
            return 1;
        }
        int n=0;
        for(int i=0;i<a.length;++i){
            int newIndex=3*n+1;
            if(newIndex<a.length && a[newIndex]!=0){
                return 0;
            }
            if(newIndex!=i && a[i]==0){
                return 0;
            }
            if(newIndex==i){
                ++n;
            }
        }
        return 1;
    }

    static int isZeroLimited2(int[] a) {
        if (a.length <= 1) {
            return 1;
        }
        int n = 0;
        for (int i = 0; i < a.length; ++i) {
            int newIndex = 3 * n + 1;
            if (newIndex < a.length && a[newIndex] != 0) {
                return 0;
            }
            if (newIndex != i && a[i] == 0) {
                return 0;
            }
            if (newIndex == i) {
                ++n;
            }
        }
        return 1;
    }

    static int isZeroLimited1(int[] a) {
        if (a.length <= 1) {
            return 1;
        }
        int[] newArr = new int[a.length];
        int index = 0;
        for (int i = 0; i < a.length; ++i) {
            int newIndex = 3 * i + 1;
            if (newIndex < a.length && a[newIndex] == 0) {
                newArr[index] = newIndex;
                ++index;
            }
        }
        boolean flugForFirstCondition = false;
        for (int i = 0; i < a.length; ++i) {
            flugForFirstCondition = false;;
            for (int l = 0; l < index; ++l) {
                int zerothIndex = newArr[l];
                if (flugForFirstCondition == false && i == zerothIndex && a[i] == 0) {
                    flugForFirstCondition = true;
                }
            }
            if (!flugForFirstCondition) {
                if (a[i] == 0) {
                    return 0;
                }
            }
        }

        return 1;
    }

}
