/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComproPrac_2021;

import java.util.Arrays;

/**
 *
 * @author faysalmazed
 */
public class Page88_Fill {
    
    public static void main(String[] args){
        System.out.println(Arrays.toString(fill(new int[]{1,2,3,5, 9, 12,-2,-1}, 3, 10)));
        System.out.println(Arrays.toString(fill(new int[]{4, 2, -3, 12}, 1, 5)));
        System.out.println(Arrays.toString(fill(new int[]{2, 6, 9, 0, -3}, 0, 4)));
    }
    
    static int[] fill(int[] arr,int k,int n){
        if(k<=0 || n<=0) return null;
        int[] arr2=new int[n];
        int index=0;
        for(int i=0;i<k;++i){
            arr2[i]=arr[i];
            index=i;
        }
        ++index;
        for(int i=index;i<n;){
            for(int l=0;l<k && i<n;++l){
               arr2[i]=arr[l];
               ++i;
            }
        }
        return arr2;
    }
    
}
