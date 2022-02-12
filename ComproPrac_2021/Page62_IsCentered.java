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
public class Page62_IsCentered {
    public static void main(String[] args){
        System.out.println(isCentered(new int[]{5, 3, 3, 4, 5}));
        System.out.println(isCentered(new int[]{3, 2, 1, 4, 5}));
        System.out.println(isCentered(new int[]{3, 2, 1, 4, 1}));
        System.out.println(isCentered(new int[]{3, 2, 1, 1, 4, 6}));
        System.out.println(isCentered(new int[]{}));
        System.out.println(isCentered(new int[]{1}));
    }
    
    static int isCentered(int[] a){
        if(a.length%2==0 || a.length==0) return 0;
        if(a.length==1) return 1;
        int middleIndex=(0+((a.length-1)-0)/2);
        for(int i=0;i<a.length;i++){
            if(i!=middleIndex && a[middleIndex]>=a[i]){
                return 0;
            }
        }
        return 1;
    }
}
