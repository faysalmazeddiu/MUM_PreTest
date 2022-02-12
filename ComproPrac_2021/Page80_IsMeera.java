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
public class Page80_IsMeera {
    public static void main(String[] args){
        System.out.println(isMeera(new int[]{7, 6, 0, 10, 1}));
        System.out.println(isMeera(new int[]{6, 10, 1}));
        //6, 10, 1
        System.out.println(isMeera(new int[]{7, 6, 10}));
        System.out.println(isMeera(new int[]{6, 10, 0}));
        System.out.println(isMeera(new int[]{3, 7, 0, 8, 0, 5}));
    }
    
    static int isMeera(int[] a){
        int countZero=0;
        int countPrime=0;
        for(int val:a){
            if(val==0){
                ++countZero;
            }
            if(isPrime(val)){
                ++countPrime;
            }
        }
        if((countZero>0 && countPrime>0) ||(countZero==0 && countPrime==0)){
            return 1;
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
