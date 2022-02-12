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
public class Page65_IsBunkerArray {
    public static void main(String[] args){
        System.out.println(isBunkerArray(new int[]{4, 9, 6, 7, 3}));
        System.out.println(isBunkerArray(new int[]{4, 9, 6, 15, 21}));
    }
    
    static int isBunkerArray(int[] a){
        for(int i=0;i<a.length-1;++i){
            if(a[i]%2!=0 && isPrime(a[i+1])){
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
