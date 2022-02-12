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
public class Page21_IsRailroadTie {
    public static void main(String[] args){
        System.out.println(isRailRoadTie(new int[]{1, 2, 0, 3, -18, 0, 2, 2}));
        System.out.println(isRailRoadTie(new int[]{1, 2, 3, 0, 2, 2}));
        System.out.println(isRailRoadTie(new int[]{0, 1, 2, 0, 3, 4}));
        System.out.println(isRailRoadTie(new int[]{1, 2, 0, 0, 3, 4}));
        System.out.println(isRailRoadTie(new int[]{1}));
        System.out.println(isRailRoadTie(new int[]{}));
        System.out.println(isRailRoadTie(new int[]{0}));
        
        System.out.println("++++++++++++++++");
        
        System.out.println(isRailRoadTie(new int[]{1, 2}));
        System.out.println(isRailRoadTie(new int[]{1, 2, 0, 1, 2, 0, 1, 2}));
        System.out.println(isRailRoadTie(new int[]{3, 3, 0, 3, 3, 0, 3, 3, 0, 3, 3}));
        System.out.println(isRailRoadTie(new int[]{0, 0, 0, 0}));
        System.out.println(isRailRoadTie(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(isRailRoadTie(new int[]{1, 3, 0, 3, 5, 0}));
    }
    
    static int isRailRoadTie(int[] a){
        if(a==null || a.length<=1) return 0;
        int countNonZero=0; 
        for(int index=0;index<a.length;++index){
            if(a[index]!=0){
                ++countNonZero;
                if(index!=0 && index<a.length-1 && a[index+1]!=0 && a[index-1]!=0)
                    return 0;
                else if(index==0 && a[index+1]==0)
                    return 0;
                else if(index==(a.length-1) && a[index-1]==0)
                    return 0;
            }
            if(index==0 || index==(a.length-1)){
                if(a[index]==0) return 0;
            }
            if(index!=0 && index!=(a.length-1)){
                if(a[index]==0 && (a[index-1]==0 || a[index+1]==0))
                    return 0;
                
            }
        }
        if(countNonZero==0)
            return 0;
        return 1;
    }
}
