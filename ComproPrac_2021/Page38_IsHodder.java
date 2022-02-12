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
public class Page38_IsHodder {

    public static void main(String[] args) {
        System.out.println(isHoldder(2));
        System.out.println(isHoldder(5));
        System.out.println(isHoldder(3));
        System.out.println(isHoldder(7));
        System.out.println(isHoldder(31));
        System.out.println(isHoldder(127));
        System.out.println(isHoldder(13));
    }

    static int isHoldder(int n) {
        if(n<=1) return 0;
        for(int i=2;i<n;++i){
            if(n%i==0) return 0;
        }
        int product=1;
        while(product<n){
            product=product*2;
        }
        if(product>n && (product-1)==n) return 1;
        return 0;
                
    }

    static int isHoldder1(int n) {
        if (!isPrime(n)) {
            return 0;
        }
        for (int i = 1; i < n; ++i) {
            int j = 1;
            int multiply = 1;
            while (j <= i) {
                multiply = multiply * 2;
                if (multiply - 1 == n) {
                    return 1;
                }
                ++j;
            }
        }
        return 0;
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
