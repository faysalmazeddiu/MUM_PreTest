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
public class Page6_StantonMeasure {
    public static void main(String[] args){
        System.out.println(stantonMeasure(new int[]{1}));
        System.out.println(stantonMeasure(new int[]{0}));
        System.out.println(stantonMeasure(new int[]{3, 1, 1, 4}));
        System.out.println(stantonMeasure(new int[]{1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4}));
        System.out.println(stantonMeasure(new int[]{}));
    }
    
    static int stantonMeasure(int[] a){
        if(a.length==0) return 0;
        int i=0, countOne=0;
        while(i<a.length){
           if(a[i]==1) ++countOne; 
           ++i;
        }
        i=0;
        int finalCount=0;
        while(i<a.length){
            if(a[i]==countOne){
                ++finalCount;
            }
            ++i;
        }
        return finalCount;
    }
}
