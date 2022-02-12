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
public class Page75_GoodSpread {
    public static void main(String[] args){
        System.out.println(goodSpread(new int[]{2, 1, 2, 5, 2, 1, 5, 9}));
        System.out.println(goodSpread(new int[]{3, 1, 3 ,1, 3, 5, 5, 3}));
    }
    
    static int goodSpread(int[] a){
        
        for(int val:a){
           int count=0;
           for(int value:a){
               if(val==value){
                   ++count;
               }
           }
           if(count>3){
               return 0;
           }
        }
        return 1;
    }
}
