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
public class Page3_PrimeCount {
    
    public static void main(String[] args){
        System.out.println(primeCount(10,30));
        System.out.println(primeCount(11,29));
        System.out.println(primeCount(20,22));
        System.out.println(primeCount(1,1));
        System.out.println(primeCount(5,5));
        System.out.println(primeCount(6,2));
        System.out.println(primeCount(-10,6));
        
        
    }
    
    static int primeCount(int start,int end){
        boolean isPrime;
        int count=0;
        for(int i=start;i<=end;i++){
            isPrime=true;
            if(i<=1){
                isPrime=false;
            }
            for(int j=2;j<i;j++){
                if(i%j==0){
                   isPrime=false;
                   break;
                }
            }
            if(isPrime==true)
                ++count;
        }
        return count;
    }
    
}
