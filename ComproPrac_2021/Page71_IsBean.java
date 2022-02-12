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
public class Page71_IsBean {
    public static void main(String[] args){
        System.out.println(isBean(new int[]{4, 9, 8}));
        System.out.println(isBean(new int[]{2, 2, 5, 11, 23}));
        System.out.println(isBean(new int[]{7, 7, 3, 6}));
        System.out.println(isBean(new int[]{0}));
        
        System.out.println(isBean(new int[]{3, 8, 4}));
    }
    
    static int isBean(int[] a){
        for(int n:a){
            boolean flug=false;
            for(int value:a){
                if(value==(2*n) || value==(2*n+1) || value==(n/2)){
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
