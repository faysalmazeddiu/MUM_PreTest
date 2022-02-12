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
public class Page67_IsTwin {

    public static void main(String[] args) {
        System.out.println(isTwin(new int[]{3, 5, 8, 10, 27}));
        System.out.println(isTwin(new int[]{11, 9, 12, 13, 23}));
        System.out.println(isTwin(new int[]{5,3,14,7,18,67}));
        System.out.println(isTwin(new int[]{13, 14, 15, 3, 5}));
        System.out.println(isTwin(new int[]{1, 17, 8, 25, 67}));
    }
    
     static int isTwin(int[] a) {
         for(int value:a){
             if(isPrime(value)){
                 
                 if(isPrime(value+2)){
                     for(int val:a){
                         if(val==(value+2)){
                             return 1;
                         }
                     }
                 }
                 
                 if(isPrime(value-2)){
                     for(int val:a){
                         if(val==(value-2)){
                             return 1;
                         }
                     }
                 }
                 return 0;
             }
         }
         return 0;
     }

    static int isTwin1(int[] a) {
        for (int val : a) {

            if (isPrime(val)) {
                int post = val + 2;
                boolean flugForPost = false;
                if (isPrime(post)) {
                    for (int value : a) {
                        if (post == value) {
                            flugForPost = true;
                            break;
                        }
                    }
                    
                }
                int pre = val - 2;
                boolean flugForPre = false;
                if (isPrime(pre)) {
                    flugForPre = false;
                    for (int value : a) {
                        if (pre == value) {
                            flugForPre = true;
                            break;
                        }
                    }
                }
                
                if(flugForPost || flugForPre){
                    return 1;
                }
                if(!flugForPost && !flugForPost){
                    return 0;
                }
                
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
