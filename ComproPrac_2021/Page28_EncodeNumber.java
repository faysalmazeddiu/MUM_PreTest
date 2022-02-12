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
public class Page28_EncodeNumber {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(encodeNumber(6936)));
        System.out.println(Arrays.toString(encodeNumber(2)));
        System.out.println(Arrays.toString(encodeNumber(6)));
        System.out.println(Arrays.toString(encodeNumber(14)));
        System.out.println(Arrays.toString(encodeNumber(24)));
        System.out.println(Arrays.toString(encodeNumber(1200)));
        System.out.println(Arrays.toString(encodeNumber(1)));
        System.out.println(Arrays.toString(encodeNumber(-18)));
    }

    static int[] encodeNumber(int n) {
        if (n <= 1) {
            return null;
        }
        int count = 0;
        int temp = n;
        for (int i = 2; i <= temp; ++i) {
            if (!isPrime(i)) {
                continue;
            }
            while (temp % i == 0) {
                ++count;
                temp /= i;
            }
        }
        //System.out.println(count);
        int[] retArr = new int[count];
        temp = n;
        int index = 0;
        for (int i = 2; i <= temp; ++i) {
            if (!isPrime(i)) {
                continue;
            }
            while (temp % i == 0) {
                retArr[index] = i;
                ++index;
                temp /= i;
            }
        }
        return retArr;
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
