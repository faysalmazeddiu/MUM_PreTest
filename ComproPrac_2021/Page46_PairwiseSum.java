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
public class Page46_PairwiseSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(pairwiseSum(new int[]{2, 1, 18, -5})));
         System.out.println(Arrays.toString(pairwiseSum(new int[]{2, 1, 18, -5, -5, -15, 0, 0, 1, -1})));
          System.out.println(Arrays.toString(pairwiseSum(new int[]{2, 1, 18})));
          System.out.println(Arrays.toString(pairwiseSum(new int[]{})));
    }

    static int[] pairwiseSum(int[] a) {
        if (a==null || a.length==0 || a.length % 2 != 0) {
            return null;
        }
        int[] retArr=new int[a.length/2];
        int index=0;
        for (int i=0;i<a.length-1;i+=2){
            retArr[index]=a[i]+a[i+1];
            ++index;
        }
        return retArr;
    }
}
