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
public class Page14_ArrayHasNoZero {
    
    public static void main(String[] args){
        System.out.println(arrayHasNoZero(new int[]{1,2,3}));
        System.out.println(arrayHasNoZero(new int[]{1,0,4,0}));
        System.out.println(arrayHasNoZero(new int[]{1,2,3,0}));
        System.out.println(arrayHasNoZero(new int[]{0,0,0,0}));
        System.out.println(arrayHasNoZero(new int[]{}));
    }
    
    static int arrayHasNoZero(int[] a){
        for(int val:a){
            if(val==0) return 0;
        }
        return 1;
    }
    
}
