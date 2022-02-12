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
public class Page68_IsComplete {
    public static void main(String[] args){
        System.out.println(isComplete(new int[]{2, 3, 2, 4, 11, 6, 10, 9, 8}));
        System.out.println(isComplete( new int[]{2,-3,4,3,6}));
        System.out.println(isComplete(new int[]{2,3,3,6}));
    }
    
    static int isComplete(int[] a){
        int countEven=0;
        int largestEven=0;
        for(int val:a){
            if(val<0) return 0;
            if(val%2==0){
                if(countEven==0){
                    largestEven=val;
                }else{
                    if(largestEven<val){
                        largestEven=val;
                    }
                }
                ++countEven;
            }
        }
        for(int i=2;i<=largestEven;i+=2){
            boolean flug=false;
            for(int val:a){
                if(val==i){
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
