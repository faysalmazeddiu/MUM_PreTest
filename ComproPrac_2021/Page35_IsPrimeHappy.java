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
public class Page35_IsPrimeHappy {

    public static void main(String[] args) {
        System.out.println(isPrimeHappy(5));
        System.out.println(isPrimeHappy(25));
        //System.out.println();
        System.out.println(isPrimeHappy(32));
        //System.out.println();
        System.out.println(isPrimeHappy(8));
        //System.out.println();
        System.out.println(isPrimeHappy(2));
    }

    static int isPrimeHappy(int n) {
        int sum = 0;
        int primeCount = 0;
        for (int i = 1; i < n; ++i) {
            boolean isPrime = true;
            if (i <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j < i; ++j) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                ++primeCount;
                sum = sum + i;
            }
        }

        if (primeCount == 0 || sum % n != 0) {
            return 0;
        }
        return 1;
    }

}
