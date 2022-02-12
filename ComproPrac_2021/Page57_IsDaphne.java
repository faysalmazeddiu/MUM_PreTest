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
public class Page57_IsDaphne {
    public static void main(String[] args){
        System.out.println(isDaphne(new int[]{2, 4, 2}));
        System.out.println(isDaphne(new int[]{1,3,17,-5}));
        System.out.println(isDaphne(new int[]{3, 2, 5} ));
    }
    
    static int isDaphne(int[] a){
        int countOdd=0,countEven=0;
        for(int val:a){
            if(val%2==0){
                if(countOdd>0) return 0;
                ++countEven;
            }else{
                if(countEven>0) return 0;
                ++countOdd;
            }
        }
        return 1;
    }
}
