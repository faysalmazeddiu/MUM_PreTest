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
public class Page78_IsComplete {
    public static void main(String[] args){
        System.out.println(isComplete(new int[]{2, 3, 2, 4, 11, 6, 10, 9, 8}));
        System.out.println(isComplete( new int[]{2,-3,4,3,6}));
        System.out.println(isComplete(new int[]{2,3,3,6}));
    }
    
    static int isComplete(int[] a){
        int i=0;
        int maxEven=0;
        for(int val:a){
            if(val<=0) return 0;
            if(val%2==0){
                if(i==0){
                    maxEven=val;
                }else{
                    if(maxEven<val){
                        maxEven=val;
                    }
                }
                ++i;
            }
        }
        
        for(int j=2;j<maxEven;j+=2){
            boolean flug=false;
            for(int val:a){
                if(val==j){
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
