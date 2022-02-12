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
public class Page62_HasKSmallFactors {

    public static void main(String[] args) {

        System.out.println(hasKSmallFactors(7, 30));
        System.out.println();
        System.out.println(hasKSmallFactors(6, 14));
        System.out.println();
        System.out.println(hasKSmallFactors(6, 30));
    }

    static boolean hasKSmallFactors(int k, int n) {
        int i = 1;
        while (i <= n) {
            //System.out.println(i+"======");
            if (n % i == 0 && i < k && (n / i) < k) {
                //System.out.println(i+"====="+n/i+"====="+k);
                return true;
            }
            ++i;
        }
        return false;
    }
}
