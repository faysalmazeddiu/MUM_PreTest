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
public class Page74_FactorTwoCount {
    public static void main(String[] args){
        System.out.println(factorTwoCount(48));
        System.out.println(factorTwoCount(27));
    }
    
    static int factorTwoCount(int n){
        int count=0;
        int nCopy=n;
        while(nCopy!=0){
            if(nCopy%2==0){
                ++count;
                nCopy/=2;
            }else{
                break;
            }
        }
        return count;
    }
}
