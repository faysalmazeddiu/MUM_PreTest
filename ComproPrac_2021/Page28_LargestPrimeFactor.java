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
public class Page28_LargestPrimeFactor {

    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(10));
        System.out.println(largestPrimeFactor(6936));
        System.out.println(largestPrimeFactor(1));
    }
    static int largestPrimeFactor(int n) {
        if (n <= 1) {
            return 0;
        }
        int largePrimeFactor = 0;
        for(int i=2;i<n;++i){
            if(isPrime(i) && n%i==0){
                if(isPrime(n/i)){
                    largePrimeFactor=n/i;
                    break;
                }else{
                    largePrimeFactor=i;
                }
            }
        }
        return largePrimeFactor;
    }
    

    static int largestPrimeFactor1(int n) {
        if (n <= 1) {
            return 0;
        }
        int largePrimeFactor = 0;
        int primeCount=0;
        for (int i = 2; i < n; ++i) {
            if (n % i == 0 && isPrime(i)) {
                if(primeCount==0){
                    largePrimeFactor=i;
                }else{
                    if(largePrimeFactor<i){
                        largePrimeFactor=i;
                    }
                }
                ++primeCount;
            }
        }
        return largePrimeFactor;
    }

    static boolean isPrime(int n) {
        if(n<=1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
