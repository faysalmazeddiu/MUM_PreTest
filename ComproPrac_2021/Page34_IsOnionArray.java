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
public class Page34_IsOnionArray {
    
    public static void main(String[] args){
        System.out.println(isOpineArray(new int[]{1, 2, 19, 4, 5}));
        System.out.println(isOpineArray(new int[]{1, 2, 3, 4, 15}));
        System.out.println(isOpineArray(new int[]{1, 3, 9, 8}));
        System.out.println(isOpineArray(new int[]{2}));
        System.out.println(isOpineArray(new int[]{}));
        System.out.println(isOpineArray(new int[]{-2, 5, 0, 5, 12}));
    }
    static int isOpineArray(int[] a){
        if(a==null || a.length<=1) return 1;
        for(int i=0,j=a.length-1;i<j;++i,--j){
           // if(i+j==a.length){
                if(a[i]+a[j]>10)
                    return 0;
           // }
        }
        return 1;
    }
    
}
