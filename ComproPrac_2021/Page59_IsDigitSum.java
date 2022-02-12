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
public class Page59_IsDigitSum {
    public static void main(String[] args){
        System.out.println(isDigitSum(32121,10));
        System.out.println(isDigitSum(32121,9));
        System.out.println(isDigitSum(13, 6));
        System.out.println(isDigitSum(3, 3));
        System.out.println(isDigitSum(-543, 3));
    }
    
    static int isDigitSum(int n,int m){
        if(m<0 || n<0) return -1;
        int sum=0;
        for(int i=n;i!=0;i/=10){
            int rem=i%10;
            sum+=rem;
        }
        if(sum>=m) return 0;
        return 1;
    }
}
