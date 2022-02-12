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
public class Page53_IsTwinPrime {

    public static void main(String[] args) {
        System.out.println(isTwinPrime(5));
        System.out.println(isTwinPrime(7));
        System.out.println(isTwinPrime(53));
        System.out.println(isTwinPrime(9));
    }

    static int isTwinPrime(int n) {

        for (int i = 2; i < n; ++i) {
            if (n <= 1) {
                return 0;
            }
            if (n % i == 0) {
                return 0;
            }
        }

        boolean flugAddTwo = true;
        for (int i = 2; i < (n + 2); ++i) {
            if ((n+2) <= 1 || (n + 2) % i == 0) {
                flugAddTwo = false;
                break;
            }
        }
        if (flugAddTwo == true) {
            return 1;
        }
        boolean flugMinuseTwo = true;

        for (int i = 2; i < (n - 2); ++i) {
            if ((n-2) <= 1 || (n - 2) % i == 0) {
                flugMinuseTwo = false;
                break;
            }
        }
        if (flugMinuseTwo == true) {
            return 1;
        }
        return 0;
    }

}
