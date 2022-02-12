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
public class Page43_IsPairedN {
    public static void main(String[] args){
         System.out.println(isPaired(new int[]{1, 4, 1, 4, 5, 6}, 5));
        System.out.println(isPaired(new int[]{1, 4, 1, 4, 5, 6}, 6));
        System.out.println(isPaired(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}, 6));
        System.out.println(isPaired(new int[]{1, 4, 1}, 5));
        System.out.println(isPaired(new int[]{8, 8, 8, 8, 7, 7, 7}, 15));
        System.out.println(isPaired(new int[]{8, -8, 8, 8, 7, 7, -7}, -15));
        System.out.println(isPaired(new int[]{3}, 3));
        System.out.println(isPaired(new int[]{}, 0));
    }
    
    static int isPaired(int[] a,int n){
        if(a.length<n) return 0;
        for(int i=0;i<a.length;++i){
            for(int j=0;j<a.length;++j){
                if(i!=j && a[i]!=0 && a[j]!=0 && a[i]!=a[j] && (a[i]+a[j])== n && (i+j)==n){
                    //System.out.println(i+"===="+j);
                    //System.out.println(a[i]+"===="+a[j]);
                    return 1;
                }
            }
        }
        return 0;
    }
}
