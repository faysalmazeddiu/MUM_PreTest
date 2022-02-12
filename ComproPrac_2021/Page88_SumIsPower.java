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
public class Page88_SumIsPower {

    public static void main(String[] args) {
        System.out.println(sumIsPower(new int[]{8,8,8,8}));
        System.out.println(sumIsPower(new int[]{8,8,8}));
    }

    static boolean sumIsPower(int[] arr) {
        int sum = 0;
        for (int val : arr) {
            sum += val;
        }
        int i = 1;
        int pro = 1;
        while (i < sum) {
            pro = pro * 2;
            if (pro == sum) {
                return true;
            }
            ++i;
        }
        return false;
    }
}
