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
public class Page82_IsMeera {
    public static void main(String[] args){
        System.out.println(isMeera(6));
        System.out.println(isMeera(21));
        System.out.println(isMeera(30));
    }
    
    static int isMeera(int n){
        int count=0;
        for(int i=2;i<n;++i){
            if(n%i==0){
                ++count;
            }
        }
        if(n%count !=0){
            return 0;
        } 
        return 1;
    }
}
