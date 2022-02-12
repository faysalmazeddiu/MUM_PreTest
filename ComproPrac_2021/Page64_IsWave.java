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
public class Page64_IsWave {
    
    public static void main(String[] args){
        System.out.println(isWave(new int[]{7, 2, 9, 10, 5}));
         System.out.println(isWave(new int[]{4, 11, 12, 1, 6}));
          System.out.println(isWave(new int[]{1, 0, 5}));
           System.out.println(isWave(new int[]{2}));
           System.out.println(isWave(new int[]{2, 6, 3, 4}));
    }
    
    static int isWave(int[] a){
        for(int i=0;i<a.length-1;i++){
            if(a[i]%2==0 && a[i+1]%2==0){
                return 0;
            }
            if(a[i]%2!=0 && a[i+1]%2!=0){
                return 0;
            }
        }
        return 1;
    }
    
}
