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
public class Page42_ComputeHMS {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(computeHMS(3600)));
        System.out.println(Arrays.toString(computeHMS(3735)));
        System.out.println(Arrays.toString(computeHMS(380)));
        System.out.println(Arrays.toString(computeHMS(3650)));
        System.out.println(Arrays.toString(computeHMS(55)));
        System.out.println(Arrays.toString(computeHMS(0)));
    }

    static int[] computeHMS(int seconds) {
        int[] retArr = new int[3];
        int hour = 0, min = 0, sec = 0;
        if (seconds >= 3600) {
            hour = seconds / 3600;
            retArr[0] = hour;
            seconds %= 3600;
        }
        if (seconds >= 60) {
            min = seconds / 60;
            retArr[1] = min;
            seconds %= 60;
        }
        sec = seconds;
        retArr[2] = sec;

        return retArr;
    }

}
