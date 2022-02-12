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
public class Page69_FactorEqual {
    
    public static void main(String[] args){
        System.out.println(factorEqual(10,33));
        System.out.println(factorEqual(9,10));
    }
    
    static int factorEqual(int n,int m){
        int countFactorForN=0;
        for(int i=1;i<=n;++i){
            if(n%i==0){
                ++countFactorForN;
            }
        }
        
        int countFactorForM=0;
        for(int i=1;i<=m;++i){
            if(m%i==0){
                ++countFactorForM;
            }
        }
        
        if(countFactorForN!=countFactorForM) return 0;
        return 1;
    }
    
}
