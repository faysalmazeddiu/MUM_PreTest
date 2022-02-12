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
public class Page24_GetExponent {
    
    public static void main (String[] args){
        System.out.println(getExponent(162,3));
        System.out.println(getExponent(27,3));
        System.out.println(getExponent(28,3));
        System.out.println(getExponent(280,7));
        System.out.println(getExponent(-250,5));
        System.out.println(getExponent(18,1));
        System.out.println(getExponent(128,4));
    }
    
    static int  getExponent(int n,int p){
        if(p<=1) return -1;
        int count=0;
        while(Math.abs(n)%p==0){
            ++count;
            n/=p;
        }
        return count;
    }
    
}
