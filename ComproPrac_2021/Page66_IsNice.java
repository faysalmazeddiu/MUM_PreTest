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
public class Page66_IsNice {
    
    public static void main(String[] args){
        System.out.println(isNice(new int[]{2, 10, 9, 3}));
        System.out.println(isNice(new int[]{2, 2, 3, 3, 3}));
        System.out.println(isNice(new int[]{1, 1, 1, 2, 1, 1}));
        System.out.println(isNice(new int[]{0,-1,1}));
        System.out.println(isNice(new int[]{3, 4, 5, 7}));
    }
    static int isNice(int[] a){
        for(int val:a){
            boolean flug=false;
            for(int value:a){
                if(value==(val+1) || value==(val-1)){
                    flug=true;
                    break;
                }
            }
            if(!flug){
                return 0;
            }
        }
        return 1;
    }
    
}
