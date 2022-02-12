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
public class Page63_Fill {
    
    public static void main(String args[]){
        System.out.println(Arrays.toString(fill(new int[]{1,2,3,5,9,12,-2,-1},3,10)));

			System.out.println(Arrays.toString(fill(new int[]{4,2,-3,12},1,5)));

			System.out.println(Arrays.toString(fill(new int[]{2,6,9,0,-3},0,4)));
    }
    
    static int[] fill(int[] arr,int k,int n){
        if(k<=0 || n<=0) return null;
        int[] arr2=new int[n];
        int i=0;
        for(int index=0;index<k;++index,++i){
            arr2[index]=arr[index];
        }
        for(int j=i;j<arr2.length;){
            for(int index=0;index<k && j<arr2.length;++index){
                arr2[j]=arr[index];
                ++j;
            }
        }
        return arr2;
    }
    
    
}
