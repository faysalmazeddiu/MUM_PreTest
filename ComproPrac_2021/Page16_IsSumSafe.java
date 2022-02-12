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
public class Page16_IsSumSafe {
    public static void main(String[] args){
        System.out.println(isSumSafe(new int[]{5, -5, 0}));
        System.out.println(isSumSafe(new int[]{5, -2, 1}));
        //System.out.println(isSumSafe(new int[]{5, -5, 0}));
    }
    
    static int isSumSafe(int[] a){
        int sum=0;
        for(int val:a){
            sum+=val;
        }
        for(int val:a){
            if(val==sum)
                return 0;
        }
        return 1;
    }
    
}
