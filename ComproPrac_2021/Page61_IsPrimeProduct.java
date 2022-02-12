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
public class Page61_IsPrimeProduct {
    public static void main(String[] args){
        System.out.println(isPrimeProduct(22));
        System.out.println(isPrimeProduct(20));
        System.out.println(isPrimeProduct(21));
        System.out.println(isPrimeProduct(15));
        System.out.println(isPrimeProduct(18));
        System.out.println(isPrimeProduct(49));
        System.out.println(isPrimeProduct(25));
    }
    
    static int isPrimeProduct(int n){
        for(int i=2;i<n;++i){
            if(i!=(n/i) && isPrime(i) && n%i==0 && isPrime(n/i)){
                return 1;
            }
        }
        return 0;
    }
    
    static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i<n;++i){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
