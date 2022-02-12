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
public class Page59_IsFineArray_tricky_related_page53 {
    
    public static void main(String[] args){
        System.out.println(isFineArray(new int[]{4, 7, 9, 6, 5}));
         System.out.println(isFineArray(new int[]{4, 9, 6, 33}));
          System.out.println(isFineArray(new int[]{3, 8, 15}));
    }
    
    static int isFineArray(int[] a){
        int countPrime=0;
        for(int value:a){
            if(isPrime(value)==1){
               ++countPrime;
               if(isPrime(value+2)==1){
                   for(int val:a){
                       if(val==(value+2)){
                           return 1;
                       }
                   }
               }
               
               else if(isPrime(value-2)==1){
                   for(int val:a){
                       if(val==(value-2)){
                           return 1;
                       }
                   }
               
               }
               
            }
        }
        if(countPrime==0) return 1;
        return 0;
    }
    
    static int isPrime(int n){
        if(n<=1) return 0;
        for(int i=2;i<n;++i){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
    
}
