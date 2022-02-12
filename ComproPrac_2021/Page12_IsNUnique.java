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
public class Page12_IsNUnique {
    
    public static void main(String[] args){
        System.out.println(isNUnique(new int[]{2, 7, 3, 4},5));
       // System.out.println("\n");
        System.out.println(isNUnique(new int[]{2, 3, 3, 7},5));
        //System.out.println("\n");
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4},6));
        //System.out.println("\n");
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4},10));
        //System.out.println("\n");
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4},11));
        //.out.println("\n");
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4},8));
        //System.out.println("\n");
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4},4));
        //System.out.println("\n");
        System.out.println(isNUnique(new int[]{1},5));
    }
    static int isNUnique(int[] a,int n){
        int count=0;
        for(int i=0;i<a.length-1;++i){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==n)
                  ++count;
            }
            
        }
        if(count!=1)
            return 0;
        return 1;
    }
    
}
