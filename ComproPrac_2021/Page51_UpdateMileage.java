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
public class Page51_UpdateMileage {
    
    public static void main(String[] args){
        updateMileage(new int[]{8, 9, 9, 5, 0},1);
        updateMileage(new int[]{8, 9, 9, 5, 0},2);
        updateMileage(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9},1);
        updateMileage(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9},13);
    }
    
    static void updateMileage(int[] a,int miles){
        for(int i=0;i<a.length && miles>0;++i){
            miles=a[i]+miles;
            if(miles<9){
                a[i]=miles;
                miles=0;
            }else{
                a[i]=miles%10;
                miles/=10;
            }
        }
        System.out.println(Arrays.toString(a));
    }
    
}
