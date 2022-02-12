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
public class Page76_SumDigits {
    public static void main(String[] args){
        System.out.println(sumDigits(3114));
        System.out.println(sumDigits(-6543));
        System.out.println(sumDigits(0));
    }
    
    static int sumDigits(int n){
        int nCopy=(n<0)?(-1)*n:n;
        int sum=0;
        while(nCopy!=0){
            sum=sum+(nCopy%10);
            nCopy/=10;
        }
        return sum;
    }
}
