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
public class Page70_IsFibonacci {
    public static void main(String[] args){
        System.out.println(isFibonacci(4));
        System.out.println(isFibonacci(8));
        System.out.println(isFibonacci(7));
        System.out.println(isFibonacci(9));
        System.out.println(isFibonacci(13));
        System.out.println(isFibonacci(21));
        System.out.println(isFibonacci(33));
       
    }
    
    static int isFibonacci(int n){
        int fibo1=1;
        int fibo2=1;
        if(n==fibo1) return 1;
        int  fibo=0;
        for(int j=3;fibo<=n;j++){
           fibo=fibo1+fibo2;
           if(fibo==n){
               return 1;
           }
           fibo2=fibo1;
           fibo1=fibo;
        }
        return 0;
    }
}
