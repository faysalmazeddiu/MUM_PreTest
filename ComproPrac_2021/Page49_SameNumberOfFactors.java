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
public class Page49_SameNumberOfFactors {
    
    public static void main(String[] args){
        System.out.println(sameNumberOfFactors(-6,21));
        System.out.println(sameNumberOfFactors(6,21));
        System.out.println(sameNumberOfFactors(8,12));
        System.out.println(sameNumberOfFactors(23,97));
        System.out.println(sameNumberOfFactors(0,1));
        System.out.println(sameNumberOfFactors(0,0));
    }
    
    static int sameNumberOfFactors(int n1,int n2){
        if(n1<0 || n2<0) return -1;
        if(n1==n2) return 1;
        int sumofN1=0,sumOfN2=0;
        for(int j=1;j<=n1;++j){
            if(n1%j==0){
                ++sumofN1;
            }
        }
        
        for(int j=1;j<=n2;++j){
            if(n2%j==0){
                ++sumOfN2;
            }
        }
        
        if(sumofN1==sumOfN2){
            return 1;
        }
        return 0;
    }
    
}
