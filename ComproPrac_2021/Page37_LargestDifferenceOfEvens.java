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
public class Page37_LargestDifferenceOfEvens {

    public static void main(String[] args) {
        System.out.println(largestDifferenceOfEvens(new int[]{-2, 3, 4, 9}));
        System.out.println(largestDifferenceOfEvens(new int[]{1, 3, 5, 9}));
        System.out.println(largestDifferenceOfEvens(new int[]{1, 18, 5, 7, 33}));
        System.out.println(largestDifferenceOfEvens(new int[]{2, 2, 2, 2}));
        System.out.println(largestDifferenceOfEvens(new int[]{1, 2, 1, 2, 1, 4, 1, 6, 4}));
    }
    static int largestDifferenceOfEvens(int[] a) {
        int count=0,maxEven=0,minEven=0;
        for(int val:a){
            if(val%2==0){
                ++count;
                if(count==1){
                    maxEven=val;
                    minEven=val;
                }else{
                    if(maxEven<val){
                        maxEven=val;
                    }
                    if(minEven>val){
                        minEven=val;
                    }
                }
            }
        }
        if(count<=1) return -1;
        return maxEven-minEven;
    }
    

    static int largestDifferenceOfEvens1(int[] a) {
        int countEven = 0;
        for (int val : a) {
            if (val % 2 == 0) {
                ++countEven;
            }
        }
        if (countEven <= 1) {
            return -1;
        }
        int largestDifferenceOfEvens = 0;
        for (int i = 0; i < a.length; ++i) {
            if (a[i] % 2 == 0) {
                for (int j = 0; j < a.length; j++) {
                    if (i != j && a[j] % 2 == 0) {
                        if (a[i] > a[j] && largestDifferenceOfEvens < a[i] - a[j]) {
                            largestDifferenceOfEvens = a[i] - a[j];
                        } else if (a[i] < a[j] && largestDifferenceOfEvens < a[j] - a[i]) {
                            largestDifferenceOfEvens = a[j] - a[i];
                        }
                    }
                }
            }
        }
        return largestDifferenceOfEvens;
    }
}
