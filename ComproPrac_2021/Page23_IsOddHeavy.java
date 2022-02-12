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
public class Page23_IsOddHeavy {

    public static void main(String[] args) {
        System.out.println(isOddHeavy(new int[]{11, 4, 9, 2, 8}));
         System.out.println(isOddHeavy(new int[]{11, 4, 9, 2, 3, 10}));
          System.out.println(isOddHeavy(new int[]{1}));
           System.out.println(isOddHeavy(new int[]{2}));
           
           System.out.println(isOddHeavy(new int[]{1, 1, 1, 1,1, 1}));
           System.out.println(isOddHeavy(new int[]{2, 4, 6, 8,11}));
           System.out.println(isOddHeavy(new int[]{-2, -4, -6,-8, -11}));
    }

    static int isOddHeavy(int[] a) {
        int countOdd = 0;
        for (int val : a) {
            if (Math.abs(val) % 2 != 0) {
                ++countOdd;
                for (int value : a) {
                    if (Math.abs(value) % 2 == 0) {
                        if (val < value) {
                            return 0;
                        }
                    }
                }
            }
        }
        if(countOdd==0)
            return 0;
        return 1;
    }

}
