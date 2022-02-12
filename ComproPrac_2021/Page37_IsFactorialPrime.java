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
public class Page37_IsFactorialPrime {

    public static void main(String[] args) {
        System.out.println(isFactrialPrime(2));
        System.out.println(isFactrialPrime(3));
        System.out.println(isFactrialPrime(7));
        System.out.println(isFactrialPrime(8));
        System.out.println(isFactrialPrime(11));
        System.out.println(isFactrialPrime(721));
    }
    static int isFactrialPrime(int n) {
        if(!isPrime(n)) return 0;
        for(int i=1;i<n;++i){
            if((factorial(i)+1)==n){
                return 1;
            }
        }
        return 0;
    }
    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
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

    static int isFactrialPrime1(int n) {
        if (n <= 1) {
            return 0;
        }
        for (int i = 2; i < n; ++i) {
            if (n % i == 0) {
                return 0;
            }
        }

        boolean isPrimeFactorial = false;
        for (int i = 1; i < n; ++i) {
            int factorial = 1;
            for (int j = i; j >= 1; --j) {
                factorial = factorial * j;
            }
            if (factorial + 1 == n) {
                isPrimeFactorial = true;
                break;
            }
        }
        if (!isPrimeFactorial) {
            return 0;
        }
        return 1;
    }

}
