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
public class Page53_LargestAdjacentSum {
    public static void main(String[] args){
        System.out.println(largestAdjacentSum(new int[]{1, 2, 3, 4}));
        System.out.println(largestAdjacentSum(new int[]{18, -12, 9, -10}));
        System.out.println(largestAdjacentSum(new int[]{1,1,1,1,1,1,1,1,1}));
        System.out.println(largestAdjacentSum(new int[]{1,1,1,1,1,2,1,1,1}));
    }
    
    static int largestAdjacentSum(int[] a){
        int largestSum=0;
        for(int i=0;i<a.length;++i){
            for(int j=i+1;i<a.length;++j){
                if(a[i]+a[j]>largestSum){
                    largestSum=a[i]+a[j];
                }
            }
        }
        return largestSum;
    }
}
