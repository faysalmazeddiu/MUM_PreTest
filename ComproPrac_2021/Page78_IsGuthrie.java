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
public class Page78_IsGuthrie {
    public static void main(String[] args){
        System.out.println(isGuthrie(22));
        System.out.println(isGuthrie(8));
    }
    
    static int isGuthrie(int n){
     int seq=0;
     for(int i=0;i<n;++i){
         if(seq==n){
             return 1;
         }
         if(i==0){
             seq=1;
         }else{
             seq=seq+i;
         }
         //System.out.println("===="+seq);
     }
     return 0;
    }
}
