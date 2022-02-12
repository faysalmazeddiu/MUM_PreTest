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
public class Page7_SumFactor {
    
    public static void main(String[] args){
        System.out.println(sumFactor(new int[]{1, -1, 1, -1, 1, -1, 1}));
        System.out.println(sumFactor(new int[]{1, 2, 3, 4}));
        System.out.println(sumFactor(new int[]{3, 0, 2, -5, 0}));
        System.out.println(sumFactor(new int[]{9, -3, -3, -1, -1}));
        System.out.println(sumFactor(new int[]{1}));
        System.out.println(sumFactor(new int[]{0, 0, 0}));
    }
    static int sumFactor(int[] a){
        if(a.length==0) return 0;
        int sum=0;
        for(int val:a){
            sum+=val;
        }
        
        int count=0;
        for(int val:a){
            if(val==sum){
                ++count;
            }
        }
        return count;
        
    }
}
