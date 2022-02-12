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
public class Page58_IsOddValent {

    public static void main(String[] args) {
        System.out.println(isOddValent(new int[]{9, 3, 4, 9, 1}));
        System.out.println(isOddValent(new int[]{3, 3, 3, 3}));
        System.out.println(isOddValent(new int[]{8, 8, 8, 4, 4, 7, 2}));
        System.out.println(isOddValent(new int[]{1, 2, 3, 4, 5}));
        System.out.println(isOddValent(new int[]{2, 2, 2, 4, 4}));
    }

    static int isOddValent(int[] a) {
        int countOdd = 0;
        int countValueTwice = 0;
        boolean flug=false;
        for (int val : a) {
            if (val % 2 != 0) {
                ++countOdd;
            }
            if (countValueTwice < 1) {
                countValueTwice=0;
                for (int value : a) {
                    if (val == value) {
                        ++countValueTwice;
                    }
                }
            }
            
            if(countOdd>0 && countValueTwice>1){
                flug=true;
                break;
            }

        }
        if(!flug) return 0;
        return 1;

    }

    static int isOddValent1(int[] a) {
        int countOdd = 0;
        for (int value : a) {
            if (value % 2 != 0) {
                ++countOdd;
            }
        }
        int countValueTwice = 0;
        for (int value : a) {
            countValueTwice = 0;
            for (int val : a) {
                if (value == val) {
                    ++countValueTwice;
                }
            }
            if (countValueTwice > 1) {
                break;
            }
        }
        if (countOdd > 0 && countValueTwice > 1) {
            return 1;
        }
        return 0;
    }
}
