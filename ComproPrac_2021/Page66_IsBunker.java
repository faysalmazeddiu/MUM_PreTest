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
public class Page66_IsBunker {
    
    public static void main(String[] args){
        System.out.println(isBunker(new int[]{7, 6, 10, 1}));
        System.out.println(isBunker(new int[]{7, 6, 10}));
        System.out.println(isBunker(new int[]{6, 10, 1}));
        System.out.println(isBunker(new int[]{3,7, 1, 8, 1}));
    }
    
    static int isBunker(int[] a){
        int countOne=0,countPrime=0;
        for(int val:a){
            if(val==1){
                ++countOne;
            }else{
                if(isPrime(val)){
                    ++countPrime;
                }
            }
        }
        if(countOne>0 && countPrime>0) return 1;
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
