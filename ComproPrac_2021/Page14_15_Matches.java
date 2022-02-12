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
public class Page14_15_Matches {
    public static void main(String[] args){
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18},new int[]{3, -2, 3}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18},new int[]{2, 1, -1, -1, 2, 1}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18},new int[]{1, 2, -1, -1, 1, 2}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18},new int[]{2, 1, -2, 3}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18},new int[]{1, 1, 1, -1, -1, 1, 1, 1}));
        
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18},new int[]{4, -1, 3}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18},new int[]{2, -3, 3}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18},new int[]{8}));
    }
    static int matches(int[] a,int[] p){
        int i=0;
        boolean isValPositive;
        for(int val:p){
             isValPositive=false;
             if(val>0){
                  isValPositive=true;
             }
            for(int index=i;index<Math.abs(val);){
               if((isValPositive && a[index]<0) || (!isValPositive && a[index]>0) ){
                   return 0;
               }
               ++index;
               i=index;
            }
            
        }
        return 1;
    }
}
