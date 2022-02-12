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
public class Page52_IsHollow {
    public static void main(String[] args){
        
        System.out.println(isHollow(new int[]{1,2,0,0,0,3,4}));
        System.out.println(isHollow(new int[]{1,1,1,1,0,0,0,0,0,2,1,2,18}));
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 3, 4}));
        System.out.println(isHollow(new int[]{1,2,0,0,0,3,4,5}));
        System.out.println(isHollow(new int[]{3,8,3,0,0,0,3,3}));
        System.out.println(isHollow(new int[]{1,2,0,0,0,3,4,0}));
        System.out.println(isHollow(new int[]{0,1,2,0,0,0,3,4}));
        System.out.println(isHollow(new int[]{0,0,0}));
    }
    
    static int isHollow(int[] a){
        int countFirstNonZero=0;
        int indexStartForZero=0;
        for(int i=0;i<a.length;++i){
            if(a[i]==0){
                indexStartForZero=i;
                break;
            }else{
                ++countFirstNonZero;
            }
        }
        int countLastNonZero=0;
        int indexEndForZero=0;
        for(int i=a.length-1;i>=0;--i){
            if(a[i]==0){
                indexEndForZero=i;
                break;
            }else{
                ++countLastNonZero;
            }
        }
        
        int countMidZero=0;
        
        for(int i=countLastNonZero;i<=indexEndForZero;i++){
            if(a[i]!=0){
                return 0;
            }else{
                ++countMidZero;
            }
        }
        
        if(countMidZero<3) return 0;
        return 1;
    }
}
