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
public class Page64_CountDigit {
    public static void main(String[] args){
        System.out.println(countDigit(32121, 1));
        System.out.println(countDigit(33331, 3));
        System.out.println(countDigit(33331, 6));
        System.out.println(countDigit(3, 3));
        System.out.println(countDigit(-547,3));
    }
    
    static int countDigit(int n,int digit){
        if(n<0) return -1; 
        int nCopy=n;
        int countDegit=0;
        while(nCopy!=0){
            if(nCopy%10==digit) ++countDegit;
            nCopy/=10;
        }
        return countDegit;
    }
}
