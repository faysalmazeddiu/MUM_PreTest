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
public class Page72_isDual {
    public static void main(String[] args){
        System.out.println(isDuel(new int[]{1, 2, 1, 3, 3, 2}));
        System.out.println(isDuel(new int[]{2, 5, 2, 5, 5}));
        System.out.println(isDuel(new int[]{3, 1, 1, 2, 2}));
    }
    
    static int isDuel(int[] a){
        for(int value:a){
            int counEle=0;
            for(int val:a){
                if(value==val){
                    ++counEle;
                }
            }
            if(counEle!=2){
                return 0;
            }
        }
        return 1;
    }
}
