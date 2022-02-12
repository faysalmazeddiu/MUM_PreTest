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
public class Page69_IsMeera {
    public static void main(String[] args){
        System.out.println(isMeera(new int[]{-4, 0, 1, 0, 2, 1}));
        System.out.println(isMeera(new int[]{-8, 0, 0, 8, 0}));
        System.out.println(isMeera(new int[]{-8, 0, 0, 2, 0}));
    }
    
    static int isMeera(int[] a){
        int sum=0;
        for(int i=0;i<a.length;++i){
            if(a[i]>i) return 0;
            sum+=a[i];
        }
        if(sum!=0) return 0;
        return 1;
                
    }
}
